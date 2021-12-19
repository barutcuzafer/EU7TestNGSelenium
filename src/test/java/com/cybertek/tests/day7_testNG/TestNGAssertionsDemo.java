package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){
        Assert.assertEquals("title","title");
        Assert.assertEquals("url","url");
    }
    @Test
    public void test2(){
        Assert.assertEquals("test2","test2");
    }
    @Test
    public void test3(){
        String expected="Cyt";
        String actuality="Cybertek";
        Assert.assertTrue(actuality.startsWith(expected));}
        @Test
        public void test4(){
            String email="mike@smith.com";
            Assert.assertTrue(email.contains("@"));
            Assert.assertFalse(!email.contains("@"));

        }


    }

