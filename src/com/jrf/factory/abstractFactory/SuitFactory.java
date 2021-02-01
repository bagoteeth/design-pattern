package com.jrf.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:26
 */
public class SuitFactory extends AbstractFactory{
    @Override
    public Clothes getClothes(String clothes) {
        return null;
    }

    @Override
    public Suit getSuit(String suit) {
        if (suit.equals("休闲")) return new LeisureSuit();
        if (suit.equals("运动")) return new SportSuit();
        if (suit.equals("正式")) return new FormalSuit();
        return null;
    }
}
