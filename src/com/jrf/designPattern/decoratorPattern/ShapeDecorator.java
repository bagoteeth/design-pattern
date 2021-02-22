package com.jrf.designPattern.decoratorPattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 17:39
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape=decoratedShape;
    }
    public void draw(){
        decoratedShape.draw();
    }
}
