package com.jrf.designPattern.builderPattern;

/**
 * @Author ruofa
 * @Date 2021/2/5 17:03
 */
public class VegBurger extends Burger{
    @Override
    public double price() {
        return 12.5;
    }

    @Override
    public String name() {
        return "素汉堡";
    }
}
