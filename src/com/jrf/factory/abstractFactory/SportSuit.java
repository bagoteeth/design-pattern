package com.jrf.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:18
 */
public class SportSuit implements Suit{
    @Override
    public void type() {
        System.out.println("运动装");
    }
}
