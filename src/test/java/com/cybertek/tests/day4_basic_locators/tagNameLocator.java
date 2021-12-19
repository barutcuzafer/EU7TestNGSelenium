package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("CHROME");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();

        WebElement fullNameInput= driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith with Tag Name");

        driver.findElement(By.name("email")).sendKeys("Mike@Smith.com");
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);
        driver.quit();

    }
}
