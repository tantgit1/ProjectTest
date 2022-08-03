package com.testng.test.demo5Depend;

import org.testng.annotations.Test;

/*
*
* 依赖测试
*
* test1执行后 test2执行，如果test1执行失败 test2不再执行
* */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();//当test1抛出异常，test2将被忽略，不被执行o
    }
    @Test(dependsOnMethods = {"test1"})//只运行test2 也会先执行test1 再执行test2
    public void test2(){
        System.out.println("test2 run");
    }

}
