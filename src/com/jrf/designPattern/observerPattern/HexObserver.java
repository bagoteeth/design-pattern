package com.jrf.designPattern.observerPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 11:54
 */
public class HexObserver extends Observer{
    public HexObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("hex: "+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
