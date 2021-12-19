package com.cybertek.tests.day6_CSS;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssLoactor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("CHROME");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2=driver.findElement(By.cssSelector(("#disappearing_button")));

        button2.click();
        Thread.sleep(2000);

    }
}
