package com.jrf.designPattern.factory.simple;

/**
 * @Author ruofa
 * @Date 2021/1/29 16:31
 */
public class BigCar implements Car{
    @Override
    public void ring() {
        System.out.println("big");
    }
}
