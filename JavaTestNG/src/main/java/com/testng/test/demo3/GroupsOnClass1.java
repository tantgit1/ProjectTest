package com.testng.test.demo3;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("这是group class1111中的stu1111");
    }
    public void stu2(){
        System.out.println("这是group class1111中的stu2222");
    }
}
