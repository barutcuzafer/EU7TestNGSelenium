package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox= driver.findElement(By.name("email"));
        String expectedEmail="mike@cybertek.com";
        emailInputBox.sendKeys(expectedEmail);

        String actualEmail=emailInputBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        WebElement retrievePasswodButton= driver.findElement(By.id("form_submit"));
        retrievePasswodButton.click();
        WebElement actualConfirmationMessage= driver.findElement(By.name("confirmation_message"));
        System.out.println(actualConfirmationMessage);

        String expectedMessage="Your e-mail's has been sent";
        String actualMessage=actualConfirmationMessage.getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }
          driver.quit();

    }
}
