package com.testng.test.demo4Exception;

import org.testng.annotations.Test;
/*
* 在我们期望结果为某一个异常的时候可用
* 比如：我们传入了某些不合法的参数，程序抛出了异常
*
* */
public class ExpectedException {

  //这是一个测试结果会失败的异常测试
  @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("运行失败了");
    }
    //成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();//抛出异常
    }
}
