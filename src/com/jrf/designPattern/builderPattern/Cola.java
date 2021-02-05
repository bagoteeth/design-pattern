package com.jrf.designPattern.builderPattern;

/**
 * @Author ruofa
 * @Date 2021/2/5 17:06
 */
public class Cola extends ColdDrink{
    @Override
    public double price() {
        return 3;
    }

    @Override
    public String name() {
        return "可乐";
    }
}
