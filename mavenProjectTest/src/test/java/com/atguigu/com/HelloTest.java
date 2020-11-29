package com.atguigu.com;


import org.junit.Test;

/**
 * @author Dutlgy
 * @create 2020-11-29-13:13
 */
public class HelloTest {
    @Test
    public void HelloTest(){
        Hello hello = new Hello();
        String maven = hello.sayHello("maven");
        System.out.println(maven);
    }
}
