package com.jrf.designPattern.chainOfResponsibilityPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 10:26
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("console logger: "+message);
    }
}
