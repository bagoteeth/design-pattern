package com.jrf.designPattern.builderPattern;

/**
 * @Author ruofa
 * @Date 2021/2/5 17:05
 */
public abstract class ColdDrink implements Item{
    @Override
    public String name() {
        return "冷饮";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
