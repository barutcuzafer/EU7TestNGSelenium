package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement green= driver.findElement(By.id("green"));
        System.out.println("green.isEnabled() = " + green.isEnabled());
        Assert.assertFalse(green.isEnabled());
        green.click();
    }
   @Test
       public void test2(){
       WebDriver driver1= WebDriverFactory.getDriver("chrome");
       driver1.manage().window().maximize();
       driver1.get("http://practice.cybertekschool.com/dynamic_controls");
       WebElement inputBox= driver1.findElement(By.cssSelector("#input-example>input"));

        }



}





