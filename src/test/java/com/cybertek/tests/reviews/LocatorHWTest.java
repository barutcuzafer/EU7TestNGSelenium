package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHWTest {

    public static void main(String[] args) throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
      //  WebDriverManager.safaridriver().setup();
        WebDriver driver= WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("MacBook air")).click();
        int expectedPrice=790;
        WebElement PriceTextElement= driver.findElement(By.tagName("h3"));
        String priceText=PriceTextElement.getText();
        System.out.println("priceText = " + priceText);
        String [] arr=priceText.split(" ");
        int actualPrice=Integer.parseInt(arr[0].substring(1));
        System.out.println("Actual and Expected Result is the same? "+(expectedPrice==actualPrice));
        driver.close();




        // driver.get("https://www.demoblaze.com/index.html");

       // WebElement searchBox=driver.findElement(By.id("gh-ac"));
         // WebElement searchBox=driver.findElement(By.className("//input[@class='gh-tb ui-autocomplete-input']"));
         //  WebElement searchBox= driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
          // searchBox.click()

        //  String expectedSearchItem="Selenium";

        //searchBox.sendKeys(expectedSearchItem);
        //WebElement searchButton=driver.findElement(By.id("gh-btn"));
        //searchButton.click();
        //Thread.sleep(2000);
        //WebElement result= driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));
        //String str=result.getText();
        //String [] arr=str.split(" ");
        //System.out.println(arr[0]);
        //driver.close();

    }


}
