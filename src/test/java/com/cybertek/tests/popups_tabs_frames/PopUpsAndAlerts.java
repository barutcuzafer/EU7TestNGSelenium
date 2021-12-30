package com.cybertek.tests.popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpsAndAlerts {

    WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Thread.sleep(1000);


    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=a25bb");
        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c' and .='Confirm']")).click();
        driver.findElement(By.xpath("//button[@name='j_idt311:j_idt315']")).click();

    }

        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);}
    @Test
    public void test3() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        Alert alert=driver.switchTo().alert();
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        alert.dismiss();
        Thread.sleep(5000);


        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        alert.sendKeys("Hey man");
        alert.accept();


    }

