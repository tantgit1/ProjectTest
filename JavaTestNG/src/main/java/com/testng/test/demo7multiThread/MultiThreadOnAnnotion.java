package com.testng.test.demo7multiThread;

import org.testng.annotations.Test;

/*
* 多线程测试
*
* 通过注解实现多线程
* invocationCount线程数
* threadPoolSize线程池大小
* */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 5/*,threadPoolSize = 3*/)//默认线程数是1 指该测试方法用10个线程执行，线程池大小为3指同时执行3个线程
    public void test(){
        //System.out.println(1);
        System.out.printf("类1 Thread Id : %s%n",Thread.currentThread().getId());//打印线程的id currentThread()指当前线程
    }
}
