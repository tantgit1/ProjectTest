package com.testng.test.demo3;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("这是group class33333中的teacher1111");
    }
    public void teacher2(){
        System.out.println("这是group class33333中的teacher222");
    }
}