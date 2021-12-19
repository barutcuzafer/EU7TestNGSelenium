package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {

    //    WebDriverManager.chromedriver().setup();
      //  WebDriver driver=new ChromeDriver();
       // driver.get("https://cydeo.com/");
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver=new ChromeDriver();

        webDriver.get("https://www.google.com");


    }
}
