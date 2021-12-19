package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemo {

    @Test
    public void test1() throws InterruptedException {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

         WebElement userNameInput= driver.findElement(By.cssSelector("#username"));
         Assert.assertTrue(!userNameInput.isDisplayed());

         driver.findElement(By.xpath("//button[.='Start']")).click();
         WebElement enter=driver.findElement(By.xpath("//div[@class]/input"));
         Thread.sleep(6000);
         Assert.assertTrue(enter.isDisplayed());

        }


    }

