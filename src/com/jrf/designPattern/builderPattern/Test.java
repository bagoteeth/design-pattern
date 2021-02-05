package com.jrf.designPattern.builderPattern;

/**
 * @Author ruofa
 * @Date 2021/2/5 17:21
 */
public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();
        Meal mealA=mealBuilder.getMealA();
        Meal mealB=mealBuilder.getMealB();

        mealA.showCost();
        mealA.show();

        mealB.showCost();
        mealB.show();
    }
}
