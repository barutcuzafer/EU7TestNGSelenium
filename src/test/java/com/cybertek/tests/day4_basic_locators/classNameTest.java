package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classNameTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement homeLink=driver.findElement(By.className("nav-link"));
        homeLink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        System.out.println(driver.findElement(By.className("h3")).getText());


    }
}
