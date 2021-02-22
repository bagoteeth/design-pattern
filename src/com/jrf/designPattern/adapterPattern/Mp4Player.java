package com.jrf.designPattern.adapterPattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 11:37
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4:"+fileName);
    }
}
