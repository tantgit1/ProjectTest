package com.testng.test.demo8TimeOut;

import org.testng.annotations.Test;

public class TimeOutTest {
    //未超时，测试成功
    @Test(timeOut = 3000)//单位为毫秒相当于三秒
    public void timeOutTest1() throws InterruptedException{
        Thread.sleep(2000);//必须抛出异常，有代码提示
        System.out.println("测试成功");
    }

    //已超时，测试失败
    @Test(timeOut = 2000)//单位为毫秒相当于三秒
    public void timeOutTest2() throws InterruptedException{
        Thread.sleep(3000);
    }
}
