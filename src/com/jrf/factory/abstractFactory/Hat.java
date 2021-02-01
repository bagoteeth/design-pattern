package com.jrf.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:16
 */
public class Hat implements Clothes{
    @Override
    public void say() {
        System.out.println("帽子");
    }
}
