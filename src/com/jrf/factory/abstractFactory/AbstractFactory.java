package com.jrf.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:21
 */
public abstract class AbstractFactory {
    public abstract Clothes getClothes(String clothes);
    public abstract Suit getSuit(String suit);
}
