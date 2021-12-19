package com.cybertek.tests.day7_testNG;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass(){
        System.out.println("------BEFORE CLASS-------");
        System.out.println("EXECUTED BEFORE THE CLASS");
    }

    @Test
    public void test1(){
     //   System.out.println("WebDriver Opening Test Case");
          System.out.println("First Test Case");
      //  System.out.println("WebDriver Closing");
    }
    @Test
    public void test2(){
        System.out.println("Second Test Case");
    }

    @Test
    public void test3(){
        System.out.println("Third Test Case");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("WebDriver Opening Test Case");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("WebDriver Closing");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("----AFTER CLASS-----");
        System.out.println("EXECUTED AFTER THE CLASS");
    }

}
