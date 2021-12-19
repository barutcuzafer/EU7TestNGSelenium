package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class CheckBoxHW {

    public WebDriver driver;

    @BeforeClass
    public void setClass(){
        driver= WebDriverFactory.getDriver("CHROME");
    }
    @BeforeMethod
    public void openPage(){
        //open the page
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        //login to webpage
        WebElement userNameBox= driver.findElement(By.id("ctl00_MainContent_username"));
        userNameBox.sendKeys("Tester");
        WebElement passwordBox= driver.findElement(By.cssSelector("input[name='ctl00$MainContent$password']"));
        passwordBox.sendKeys("test");
        WebElement submitButton=driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
    @AfterClass
    public void killSession(){
        driver.quit();
    }

    @Test
    public void checkBoxAll(){
        //click on the check on button
        WebElement checkAllButton= driver.findElement(By.linkText("Check All"));
        checkAllButton.click();
        //verify get clicked

        for (int i = 1; i <=8; i++) {
             String rowCheckBoxLocator="//input[@type='checkbox']["+1+"]";
             WebElement rowCheckBox= driver.findElement(By.xpath(rowCheckBoxLocator));
            Assert.assertTrue(rowCheckBox.isSelected(),"The Checkbox is not selected");

        }
        WebElement unCheckButton=driver.findElement(By.linkText("Uncheck All"));
        unCheckButton.click();
        for (int i = 1; i <=8; i++) {
            String rowCheckBoxLocator="//input[@type='checkbox']["+1+"]";
            WebElement rowCheckBox= driver.findElement(By.xpath(rowCheckBoxLocator));
            Assert.assertFalse(rowCheckBox.isSelected(),"The Checkbox is  selected");

        }









    }
}
