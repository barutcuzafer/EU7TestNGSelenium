package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Driver;

public class AttributeTest {
    @Test

    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue= driver.findElement(By.id("blue"));
        WebElement red= driver.findElement(By.id("red"));

        System.out.println("blue.getAttribute(\"type\") = " + blue.getAttribute("type"));
        System.out.println("blue.getAttribute(\"checked\") = " + blue.getAttribute("checked"));
        System.out.println("blue.getAttribute(\"href\") = " + blue.getAttribute("href"));

        System.out.println("red.getAttribute(\"checked\") = " + red.getAttribute("checked"));

        System.out.println("blue.getAttribute(\"outerHTML\") = " + blue.getAttribute("outerHTML"));

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button2= driver.findElement(By.id("button2"));
        System.out.println(button2.getAttribute("outerHTML"));

        Thread.sleep(5000);
        driver.quit();

    }
}
