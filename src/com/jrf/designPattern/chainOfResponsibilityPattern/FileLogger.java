package com.jrf.designPattern.chainOfResponsibilityPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 10:31
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("file logger: "+message);
    }
}
