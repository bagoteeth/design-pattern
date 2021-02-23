package com.jrf.designPattern.proxyPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 9:52
 */
public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName=fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("loading "+fileName);
    }
    @Override
    public void display() {
        System.out.println("displaying "+fileName);
    }
}
