package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText());


    }
}
