package com.jrf.designPattern.builderPattern;

/**
 * @Author ruofa
 * @Date 2021/2/5 16:54
 */
public abstract class Burger implements Item{
    @Override
    public String name() {
        return "汉堡";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
