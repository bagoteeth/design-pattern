package com.jrf.designPattern.facadePattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 18:19
 */
public class Test {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawRectangle();
    }
}
