package com.jrf.designPattern.chainOfResponsibilityPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 10:30
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("error logger: "+message);
    }
}
