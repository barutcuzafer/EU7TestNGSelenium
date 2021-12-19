package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue= driver.findElement(By.cssSelector("#blue"));
        WebElement red= driver.findElement(By.cssSelector("#red"));

        System.out.println("blue.isSelected() = " + blue.isSelected());
        System.out.println("red.isSelected() = " + red.isSelected());

        Assert.assertTrue(blue.isSelected());
        Assert.assertFalse(red.isSelected());

        red.click();

        Assert.assertFalse(blue.isSelected());
        Assert.assertTrue(red.isSelected());

        System.out.println("blue.isSelected() = " + blue.isSelected());
        System.out.println("red.isSelected() = " + red.isSelected());


        Thread.sleep(2000);

    }

}
