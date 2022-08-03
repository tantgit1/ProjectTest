package com.testng.test.demo1;

import org.testng.annotations.*;
/*
 * TestNG基本注解
 *
 *  */
public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分，在方法上方标注
    @Test(enabled=false)//enabled=false 忽略测试，即enabled=false时，该测试方法不执行，enabled=true时执行
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是在测试方法之后运行的");
    }

    //类运行前
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass是在类运行之前运行的");
    }
   // 类运行后
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass是在类运行之后运行的");
    }

    /*
    执行顺序：
       测试套件--》类--》方法
    多个类时需使用测试套件
    */
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
