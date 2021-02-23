package com.jrf.designPattern.observerPattern;

import sun.nio.cs.ext.MS950_HKSCS_XP;

/**
 * @Author ruofa
 * @Date 2021/2/23 11:57
 */
public class Test {
    public static void main(String[] args) {
        Subject subject=new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);
        subject.setState(11);
        subject.notifyAllObservers();
        subject.setState(33);
        subject.notifyAllObservers();
    }
}
