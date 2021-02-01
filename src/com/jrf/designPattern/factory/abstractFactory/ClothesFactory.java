package com.jrf.designPattern.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:23
 */
public class ClothesFactory extends AbstractFactory{
    @Override
    public Clothes getClothes(String clothes) {
        if(clothes.equals("帽子"))return new Hat();
        if (clothes.equals("外套")) return new Coat();
        if (clothes.equals("裤子")) return new Trousers();
        return null;
    }

    @Override
    public Suit getSuit(String suit) {
        return null;
    }
}
