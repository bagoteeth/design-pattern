package com.jrf.designPattern.proxyPattern;

/**
 * @Author ruofa
 * @Date 2021/2/23 9:56
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName){
        this.fileName=fileName;
    }
    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(fileName);
        }
        realImage.display();
    }
}
