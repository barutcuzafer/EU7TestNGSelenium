package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropDownElement= driver.findElement(By.id("dropdownMenuLink"));
        dropDownElement.click();

        List<WebElement> dropdownOptions =driver.findElements(By.className("dropdown-item"));
        System.out.println("dropdownOptions.size() = " + dropdownOptions.size());
        Assert.assertEquals(dropdownOptions.size(),5,"verify size options is 5");
        for (WebElement dropdownOption : dropdownOptions) {
            System.out.println("dropdownOption.getText() = " + dropdownOption.getText());
        }
        dropdownOptions.get(2).click();


    }
}