package com.jrf.designPattern.factory.simple;

/**
 * @Author ruofa
 * @Date 2021/1/29 16:33
 */
public class SmallCar implements Car{
    @Override
    public void ring() {
        System.out.println("small");
    }
}
