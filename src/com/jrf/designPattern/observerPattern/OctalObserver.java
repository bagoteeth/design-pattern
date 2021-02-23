package com.jrf.designPattern.observerPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 11:53
 */
public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("octal: "+Integer.toOctalString(subject.getState()));
    }
}
