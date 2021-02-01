package com.jrf.designPattern.singleton;

/**
 * @Author ruofa
 * @Date 2021/2/1 17:26
 */
public class SingleObject {
    private static SingleObject singleObject;
    private SingleObject(){};
    public static SingleObject getInstance(){
        if(singleObject==null){
            synchronized (SingleObject.class){
                if(singleObject==null){
                    singleObject=new SingleObject();
                }
            }
        }
        return singleObject;
    }
    public void doSomething(){
        System.out.println("it's a single object");
    }
}
