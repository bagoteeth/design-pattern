package com.jrf.designPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ruofa
 * @Date 2021/2/23 11:43
 */
public class Subject {
    private List<Observer> observers=new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
}
