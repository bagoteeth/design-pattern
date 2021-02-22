package com.jrf.designPattern.decoratorPattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 17:48
 */
public class Test {
    public static void main(String[] args) {
        Shape circle=new Circle();
        ShapeDecorator redCircle=new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle=new RedShapeDecorator(new Rectangle());
        System.out.println("----------");
        circle.draw();
        System.out.println("----------");
        redCircle.draw();
        System.out.println("----------");
        redRectangle.draw();
        System.out.println("----------");
    }
}
