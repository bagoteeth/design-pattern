package com.jrf.designPattern.decoratorPattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 17:42
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratorShape){
        System.out.println("红色");
    }
}
