package com.jrf.designPattern.proxyPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 10:00
 */
public class Test {
    public static void main(String[] args) {
        Image image=new ProxyImage("test.jpg");
        image.display();
        System.out.println("--------------");
        image.display();
    }
}
