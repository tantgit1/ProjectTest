package com.testng.test.demo6paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*
* 参数化
* */
public class ParamTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest(String name,int age){
        System.out.println("name="+name+",age="+age);
    }


}
