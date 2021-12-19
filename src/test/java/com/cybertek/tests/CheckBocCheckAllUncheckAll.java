package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CheckBocCheckAllUncheckAll {

    @Test
    public void test() throws InterruptedException {
        //Navigate to website
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        //locate the input boxes and pass the values
        WebElement userName= driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement passWord= driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        passWord.sendKeys("test");
        Thread.sleep(1000);
         //locate submit button and click
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //locate checkbox and click
        driver.findElement(By.xpath("//a[.='Check All']")).click();
        Thread.sleep(2000);
         //check all checkboxes are checked
         WebElement box1=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
         Assert.assertTrue(box1.isSelected());
         System.out.println("First box is checked "+box1.isSelected());

        WebElement box2=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        Assert.assertTrue(box2.isSelected());
        System.out.println("Second box is checked "+box2.isSelected());

        WebElement box3=driver.findElement(By.xpath("//input[@type='checkbox'][@id='ctl00_MainContent_orderGrid_ctl04_OrderSelector']"));
        Assert.assertTrue(box3.isSelected());
        System.out.println("Third box is checked "+box3.isSelected());

        WebElement box4=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        Assert.assertTrue(box4.isSelected());
        System.out.println("Fourth box is checked  "+box4.isSelected());


        WebElement box5=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl06_OrderSelector"));
        Assert.assertTrue(box5.isSelected());
        System.out.println("Fifth box is checked "+box5.isSelected());

        WebElement box6=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl07_OrderSelector"));
        Assert.assertTrue(box6.isSelected());
        System.out.println("Sixth box is checked "+box6.isSelected());

        WebElement box7=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl08_OrderSelector"));
        Assert.assertTrue(box7.isSelected());
        System.out.println("Seventh box is checked "+box7.isSelected());

        WebElement box8=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl09_OrderSelector"));
        Assert.assertTrue(box8.isSelected());
        System.out.println("Eight box is checked "+box8.isSelected());

        //locate  UncheckAll and click
        WebElement UncheckAll=driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll"));
        UncheckAll.click();
        Thread.sleep(2000);
        //verify all checkboxes are unchecked
        WebElement box11=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
        Assert.assertTrue(!box11.isSelected());
        System.out.println("First box is unchecked "+!box11.isSelected());

        WebElement box22=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        Assert.assertTrue(!box22.isSelected());
        System.out.println("Second box is unchecked "+!box22.isSelected());

        WebElement box33=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl04_OrderSelector"));
        Assert.assertTrue(!box33.isSelected());
        System.out.println("Third box is unchecked "+!box33.isSelected());

        WebElement box44=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        Assert.assertTrue(!box44.isSelected());
        System.out.println("Fourth box is unchecked "+!box44.isSelected());

        WebElement box55=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        Assert.assertTrue(!box55.isSelected());
        System.out.println("Fifth box is unchecked "+!box55.isSelected());

        WebElement box66=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl06_OrderSelector"));
        Assert.assertTrue(!box66.isSelected());
        System.out.println("Sixth box is unchecked "+!box66.isSelected());

        WebElement box77=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl07_OrderSelector"));
        Assert.assertTrue(!box77.isSelected());
        System.out.println("Seventh box is unchecked "+!box77.isSelected());

        WebElement box88=driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl08_OrderSelector"));
        Assert.assertTrue(!box88.isSelected());
        System.out.println("Eight box is unchecked "+!box88.isSelected());

        //click one of the box and click delete selected
        String str1=box88.getText();
        System.out.println(str1.toString());
        box88.click();
        Thread.sleep(2000);
        WebElement DeleteSelected= driver.findElement(By.xpath("//input[@value='Delete Selected']"));
        Thread.sleep(2000);
        DeleteSelected.click();

        Assert.assertTrue(!box88.isEnabled());


        WebElement table=driver.findElement(By.xpath("//table[@class='SampleTable']"));
        String str2=table.getText();
        System.out.println(str2.toCharArray());






        }










    }


