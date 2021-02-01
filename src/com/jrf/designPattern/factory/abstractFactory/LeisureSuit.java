package com.jrf.designPattern.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:19
 */
public class LeisureSuit implements Suit{
    @Override
    public void type() {
        System.out.println("休闲装");
    }
}
