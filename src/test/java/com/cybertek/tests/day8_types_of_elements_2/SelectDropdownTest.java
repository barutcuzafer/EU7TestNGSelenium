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

public class SelectDropdownTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");


    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropDownElement= driver.findElement(By.id("state"));
        Select selectDropdown=new Select(dropDownElement);
        List<WebElement> options=selectDropdown.getOptions();
        System.out.println("options.size() = " + options.size());
        selectDropdown.selectByIndex(6);
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropDownElement= driver.findElement(By.id("state"));
        Select stateDropDown=new Select(dropDownElement);
        String expectedOption="Select a State";
        String actualOption=stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);
        Thread.sleep(1000);
        stateDropDown.selectByVisibleText("Virginia");
        expectedOption="Virginia";
        actualOption=stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"Verify first selecttion");

        Thread.sleep(1000);
        stateDropDown.selectByIndex(51);
        expectedOption="Wyoming";
        actualOption=stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"Verify first selecttion");

        Thread.sleep(1000);
        stateDropDown.selectByValue("TX");
        expectedOption="Texas";
        actualOption=stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"Verify first selecttion");



        }


    }

