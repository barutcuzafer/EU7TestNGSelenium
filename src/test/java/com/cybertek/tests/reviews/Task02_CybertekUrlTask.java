package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02_CybertekUrlTask {
    public static void main(String[] args) {

          WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
          driver.get("https://cybertekschool.okta.com/");

          String ExpectedUrl="cybertekschool";
          String ActualUrl=driver.getCurrentUrl();

        System.out.println("Verify if the URL contains cybertekschool  = " +  ActualUrl.contains(ExpectedUrl));








    }
}
