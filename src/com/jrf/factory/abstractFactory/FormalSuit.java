package com.jrf.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:20
 */
public class FormalSuit implements Suit{
    @Override
    public void type() {
        System.out.println("正装");
    }
}
