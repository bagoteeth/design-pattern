package com.jrf.designPattern.builderPattern;

/**
 * @Author ruofa
 * @Date 2021/2/5 16:55
 */
public class ChickenBurger extends Burger{
    @Override
    public double price() {
        return 20.5;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }
}
