package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullNameInput=driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("Mike@smith.com");
        Thread.sleep(3000);

        WebElement clickSubmitButton=driver.findElement(By.name("wooden_spoon"));
        clickSubmitButton.click();
        WebElement backButton=driver.findElement(By.className("i class"));
        backButton.click();




    }

}
