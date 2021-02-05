package com.jrf.designPattern.builderPattern;

/**
 * @Author ruofa
 * @Date 2021/2/5 17:07
 */
public class Coffee extends ColdDrink{
    @Override
    public double price() {
        return 5;
    }

    @Override
    public String name() {
        return "咖啡";
    }
}
