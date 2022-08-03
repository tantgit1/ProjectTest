package com.testng.test.demo2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("BeforeSuite测试套件开始执行");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("AfterSuite测试套件开始执行");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
