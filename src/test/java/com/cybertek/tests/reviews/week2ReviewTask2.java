package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class week2ReviewTask2 {

    WebDriver driver=null;
    public static WebDriver getDriver(String browser){
        WebDriver driver= WebDriverFactory.getDriver("CHROME");
        driver.get("https://www.demoblaze.com/index.html");
        return driver;
    }


}
