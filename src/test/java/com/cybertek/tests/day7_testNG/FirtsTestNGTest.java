package com.cybertek.tests.day7_testNG;

import org.testng.annotations.Test;

public class FirtsTestNGTest {

    @Test
    public void test1(){
        System.out.println("My first test case");
    }
    @Test
    public void test2(){
        System.out.println("My second test");
    }
    @Test
    private static void test3(){
        int i=10;
        System.out.println(i);

    }



}
