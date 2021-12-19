package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {
          WebDriver driver=WebDriverFactory.getDriver("CHROME");
          driver.get("https://www.google.com");
          Thread.sleep(3000);
          driver.navigate().to("https://www.gmail.com");

                  
    }


}
