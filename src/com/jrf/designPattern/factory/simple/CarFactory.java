package com.jrf.designPattern.factory.simple;

/**
 * @Author ruofa
 * @Date 2021/1/29 16:34
 */
public class CarFactory {
    public Car getCar(String car){
        if(car.equals("大车")) return new BigCar();
        if(car.equals("中车")) return new MediumCar();
        if(car.equals("小车")) return new SmallCar();
        return null;
    }
}
