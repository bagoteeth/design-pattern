package com.jrf.designPattern.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:58
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equals("套装")) return new SuitFactory();
        if(factory.equals("单件")) return new ClothesFactory();
        return null;
    }
}
