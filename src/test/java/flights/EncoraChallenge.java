package flights;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class EncoraChallenge extends BaseTest {
    /* I know we should use the page object model but because of the time i had to solve the issue
    i did not include the page objects for Stays and Flights page, its a basic concept i know and use the POM
    in my test frameworks
     */

    @Test
    public void validateFlightPricesAreInAscendingOrder() {
        Waits waits = new Waits(driver);
        driver.navigate().to(Links.FLIGHTS_URL);

        WebElement departureCityWebElement = waits.waitForVisibility(By.id("flight-from"), 5);
        Select departureCitySelect = new Select(departureCityWebElement);
        departureCitySelect.selectByVisibleText(TestData.DEPARTURE_CITY);

        WebElement destinationCity = waits.waitForVisibility(By.id("flight-to"), 5);
        Select destinationSelect = new Select(destinationCity);
        destinationSelect.selectByVisibleText(TestData.DESTINATION_CITY);

        DateUtils dateUtils = new DateUtils();
        WebElement departingInput = waits.waitForVisibility(By.id("departing"), 5);
        departingInput.clear();
        departingInput.sendKeys(dateUtils.getFormattedDate(1));

        WebElement returningInput = waits.waitForVisibility(By.id("returning"), 5);
        returningInput.clear();
        returningInput.sendKeys(dateUtils.getFormattedDate(5));

        driver.findElement(By.className("button-ns")).click();

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement sortFilterWebElement = fluentWait.until(ExpectedConditions.elementToBeClickable((By.id("sort"))));

        Select sortingSelect = new Select(sortFilterWebElement);
        sortingSelect.selectByValue("asc");
        List<WebElement> pricesList = fluentWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[@class='price']"), 0));
        System.out.println(getPrices(pricesList));
        Assert.assertTrue(isSortedAscending(getPrices(pricesList)));
    }

    List<Double> getPrices(List<WebElement> pricesList) {
        return pricesList.stream()
                .map(WebElement::getText)
                .map(text -> text.replaceAll("[^0-9.]", ""))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }

    boolean isSortedAscending(List<Double> prices) {
        for (int i = 0; i < prices.size() - 1; i++) {
            if (prices.get(i) > prices.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
