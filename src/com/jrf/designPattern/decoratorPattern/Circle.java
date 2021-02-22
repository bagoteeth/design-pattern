package com.jrf.designPattern.decoratorPattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 17:33
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
