package com.jrf.designPattern.facadePattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 18:14
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    public ShapeMaker(){
        circle=new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
