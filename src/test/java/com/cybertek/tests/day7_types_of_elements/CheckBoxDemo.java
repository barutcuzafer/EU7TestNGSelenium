package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {

    @Test
            public void test1(){
    WebDriver driver= WebDriverFactory.getDriver("CHROME");
    driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement box1= driver.findElement(By.xpath("//input[1]"));
        WebElement box2= driver.findElement(By.xpath("//input[2]"));
        System.out.println("box1.isSelected() = " + box1.isSelected());
        System.out.println("box2.isSelected() = " + box2.isSelected());

        Assert.assertFalse(box1.isSelected());
        Assert.assertTrue(box2.isSelected());

        box1.click();
        Assert.assertTrue(box1.isSelected()&& box2.isSelected());


    }
}
