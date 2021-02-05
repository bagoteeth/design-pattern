package com.jrf.designPattern.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ruofa
 * @Date 2021/2/5 17:08
 */
public class Meal {
    private List<Item> items=new ArrayList<>();
    public void add(Item item){
        items.add(item);
    }
    public void showCost(){
        double cost=0;
        for(Item item:items){
            cost+=item.price();
        }
        System.out.println("cost");
        System.out.println("----------------------");
        System.out.println(cost);
        System.out.println("----------------------");
    }
    public void show(){
        System.out.println("show:");
        for(Item item:items){
            System.out.println("----------------------");
            System.out.println("Item:"+item.name());
            System.out.println("Packing:"+item.packing().pack());
            System.out.println("Price:"+item.price());
            System.out.println("----------------------");
        }
    }
}
