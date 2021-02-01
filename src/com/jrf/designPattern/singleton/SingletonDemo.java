package com.jrf.designPattern.singleton;

/**
 * @Author ruofa
 * @Date 2021/2/1 17:28
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject singleObject=SingleObject.getInstance();
        singleObject.doSomething();
    }
}
