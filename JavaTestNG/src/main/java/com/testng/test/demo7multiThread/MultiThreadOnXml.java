package com.testng.test.demo7multiThread;

import org.testng.annotations.Test;

/*
* 通过xml实现多线程
* */
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("类2方法1Thread Id : %s%n",Thread.currentThread().getId());//打印线程的id currentThread()指当前线程
    }
    @Test
    public void test2(){
        System.out.printf("类2方法2Thread Id : %s%n",Thread.currentThread().getId());//打印线程的id currentThread()指当前线程
    }
    @Test
    public void test3(){
        System.out.printf("类2方法3Thread Id : %s%n",Thread.currentThread().getId());//打印线程的id currentThread()指当前线程
    }
    @Test
    public void test4(){
        System.out.printf("类2方法4Thread Id : %s%n",Thread.currentThread().getId());//打印线程的id currentThread()指当前线程
    }

}
