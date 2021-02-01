package com.jrf.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:13
 */
public class Coat implements Clothes{
    @Override
    public void say() {
        System.out.println("外衣");
    }
}
