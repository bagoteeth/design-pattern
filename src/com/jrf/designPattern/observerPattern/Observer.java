package com.jrf.designPattern.observerPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 11:47
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
