package com.jrf.designPattern.builderPattern;

/**
 * @Author ruofa
 * @Date 2021/2/5 17:15
 */
public class MealBuilder {
    public Meal getMealA(){
        Meal meal=new Meal();
        meal.add(new ChickenBurger());
        meal.add(new Cola());
        return meal;
    }
    public Meal getMealB(){
        Meal meal=new Meal();
        meal.add(new VegBurger());
        meal.add(new Coffee());
        return meal;
    }
}
