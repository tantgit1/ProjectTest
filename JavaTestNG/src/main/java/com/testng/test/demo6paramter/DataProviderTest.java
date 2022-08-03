package com.testng.test.demo6paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
/*
* 参数化方法
* 以下两种方式：
*       单个方法直接传参--参考 "people"，直接初始化变量并赋值
*       多个方法分别传参--参考 "methodData"，先初始化变量，不同的方法再分别赋值
* */
public class DataProviderTest {
    @Test(dataProvider = "people")//多参属性
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+",age="+age);
    }

    @DataProvider(name = "people")
    public Object[][] provideData(){//相当于创建了一个需要Object类型返回值的方法
        Object[][] obj=new Object[][]{//初始化一个Object类型的变量，并赋值
                {"张三",19},
                {"李四",22},
                {"王五",21},
                {"小明",17}
        };
        return obj;//返回一个Object类型的数据
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test111111方法中的：name="+name+",age="+age);

    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test222222方法中的：name="+name+",age="+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if (method.getName().equals("test1")){
            System.out.println("方法1已执行");
            result=new Object[][]{
                    {"张三",19},
                    {"李四",22}
            };
        }else if (method.getName().equals("test2")){
            System.out.println("方法2已执行");
            result=new Object[][]{
                    {"王五",21},
                    {"小明",17}
            };
        }
        else{
            System.out.println("没走test1,也没走test2");
            throw new RuntimeException();
        }

        return result;//返回一个Object类型的数据
    }
}
