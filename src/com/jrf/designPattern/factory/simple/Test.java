package com.jrf.designPattern.factory.simple;

/**
 * @Author ruofa
 * @Date 2021/1/29 16:37
 */
public class Test {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        Car bigCar=carFactory.getCar("大车");
        bigCar.ring();
        Car mediumCar=carFactory.getCar("中车");
        mediumCar.ring();
        Car smallCar=carFactory.getCar("小车");
        smallCar.ring();
    }
}
