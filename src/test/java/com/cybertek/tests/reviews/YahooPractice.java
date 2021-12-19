package com.cybertek.tests.reviews;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class YahooPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.yahoo.com");

        String expectedTitle="Yahoo";
        String actualTitle=driver.getTitle();

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        switch (driver.getTitle().toLowerCase()){
            case "Yahoo":
                System.out.println("Test Passed");
                break;
            case "webPage":
                System.out.println("Test Failed");
                break;

        }
    }
}
