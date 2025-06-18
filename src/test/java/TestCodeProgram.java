import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class TestCodeProgram {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-save-password-bubble");
        options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false
        ));
        //     driver = new ChromeDriver();
    }

    @Test
    public void testCode() {
        driver.get("https://mvnrepository.com/");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://mvnrepository.com/");

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Maven Repository: Search/Browse/Explore");
    }

    @Test
    public void fluentWaitCode(){
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class);

        WebElement loginButton = fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("id")));

        

    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{
                {"pedro", "secretpassword", false},
                {"adrian", "", false},
                {"maria", "admin123", false}
        };
    }


    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, boolean isValid) {
        driver.get("https://the-internet.herokuapp.com/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usernameWebElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        usernameWebElement.sendKeys(username);
        WebElement passwordWebElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        passwordWebElement.sendKeys(password);
        WebElement submitButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[type='submit']")));
        submitButton.click();

        if (isValid) {
            WebElement successLabel = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".flash.success")));
            boolean success = successLabel.isDisplayed();
            Assert.assertTrue(success, "Login should succeed for valid credentials.");
        } else {
            WebElement errorLabel = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".flash.error")));
            boolean failure = errorLabel.isDisplayed();
            Assert.assertTrue(failure, "Login should fail for invalid credentials.");
        }
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        if (driver != null) {
            driver.close();
        }

    }

    @Test
    public void testAlgoCode() {
        int[] numbers = {2, 3, 6, 10};
        int[] numbers2 = {10, 5, 29, 2};

        codeChallenge(numbers, numbers2);

    }

    public int[] codeChallenge(int[] numbers, int[] numbers2) {
        // compare values in any position
        // usar un set para identificar los repetidos
        Set<Integer> repeatedNumbers1 = new HashSet<>();
        for (int number : numbers) {
            repeatedNumbers1.add(number);
        }

        List<Integer> matches = new ArrayList<>();

        for (int number : numbers2) {
            if (repeatedNumbers1.contains(number)){
                repeatedNumbers1.remove(number);
            }else {
                repeatedNumbers1.add(number);
            }
        }

        System.out.println(repeatedNumbers1);

        return new int []{};
    }
}
