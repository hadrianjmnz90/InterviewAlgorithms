package practice;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPractice {

    List<Product> products = Arrays.asList(
            new Product("Pencil", 1.50, "Stationery"),
            new Product("Notebook", 4.00, "Stationery"),
            new Product("Backpack", 25.00, "Bags"),
            new Product("Laptop", 899.99, "Electronics"),
            new Product("Mouse", 19.99, "Electronics"),
            new Product("Water Bottle", 7.50, "Accessories"),
            new Product("Pen", 2.00, "Stationery"),
            new Product("Disk", 3.50, "Electronics")
    );
//Group all products by category, so the result is a Map<String, List<Product>>.
    @Test
    public void groupProductsByCategory (){
       Map<String, List<Product>> groupedProducts = products.stream()
               .collect(Collectors.groupingBy(Product::getCategory));

       System.out.println(groupedProducts);
    }

  //  Find the most expensive product in the list. Return it as an Optional<Product> (since the list might be empty).
    @Test
    public void getMostExpensiveProduct(){
        Optional<Product> mostExpensiveProduct = products.stream()
                .max(Comparator.comparingDouble(Product::getPrice));

        mostExpensiveProduct.ifPresent(p -> System.out.println("Most expensive: " + p));
    }

    @Test
    public void getAllProductsUnder5Dollars(){
        List<Product> productsUnder5 = products
                .stream().filter(p -> p.getPrice() < 5 )
                .collect(Collectors.toList());

        productsUnder5.forEach(System.out::println);
    }

    @Test
    public void getAllProductsAbove5Dollars(){
        List<Product> productsFrom5 = products
                .stream().filter(p -> p.getPrice() >=5)
                .collect(Collectors.toList());

        productsFrom5.forEach(System.out::println);
    }

    @Test
    public void getProductsInElectronicsCategory(){
        List<Product> productsInElectronics = products
                .stream().filter(p -> p.getCategory() == "Electronics")
                .collect(Collectors.toList());
        productsInElectronics.forEach(System.out::println);
    }

    @Test
    public void getAverageOfProductsInElectronics(){
        double averagePrice = products.stream()
                .filter(p -> p.getCategory().equals( "Electronics"))
                .mapToDouble(Product::getPrice)
                        .average().orElse(0.0);

        System.out.println(averagePrice);
    }

  //  Find all products in the "Stationery" category and collect them into a list.

    @Test
    public void getAllProductsInStationery(){
        List<Product> stationaryCategory = products.stream()
                .filter(p -> p.getCategory().equals("Stationery"))
                .collect(Collectors.toList());

        stationaryCategory.forEach( System.out::println);
    }

    @Test
    public void calculateAveragePriceAllProducts(){
        double averagePriceAllProducts = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.00);
        System.out.println("Average price " + averagePriceAllProducts);
    }

    @Test
    public void getCheapProducts(){
        List<Product> cheapProducts = products.stream()
                .filter(p-> p.getPrice() < 5)
                .collect(Collectors.toList());

        cheapProducts.forEach(System.out::println);
    }

    @Test
    public void getCheapProductsInCategory(){
        List<Product> cheapProducts = products.stream()
                .filter(p-> p.getPrice() < 5 )
                .filter(p -> p.getCategory().equals("Electronics"))
                .collect(Collectors.toList());

        cheapProducts.forEach(System.out::println);
    }

    @Test
    public void getCheapProductsExcludingCategory(){
        List<Product> cheapProducts = products.stream()
                .filter(p-> p.getPrice() < 5 &&  !p.getCategory().equals("Stationery"))
                .collect(Collectors.toList());

        cheapProducts.forEach(System.out::println);
    }
}
