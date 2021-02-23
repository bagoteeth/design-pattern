package com.jrf.designPattern.observerPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 11:50
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("binary: "+Integer.toBinaryString(subject.getState()));
    }
}
