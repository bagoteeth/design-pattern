package com.jrf.designPattern.factory.abstractFactory;

/**
 * @Author ruofa
 * @Date 2021/1/29 17:56
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory clothesFactory=FactoryProducer.getFactory("单件");
        AbstractFactory suitFactory=FactoryProducer.getFactory("套装");

        try{
            Clothes hat=clothesFactory.getClothes("帽子");
            hat.say();

            Clothes coat=clothesFactory.getClothes("外套");
            coat.say();

            Clothes trousers=clothesFactory.getClothes("裤子");
            trousers.say();

            Suit leisure=suitFactory.getSuit("休闲");
            leisure.type();

            Suit sport=suitFactory.getSuit("运动");
            sport.type();

            Suit formal=suitFactory.getSuit("正式");
            formal.type();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
