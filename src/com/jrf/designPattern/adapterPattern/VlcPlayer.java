package com.jrf.designPattern.adapterPattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 11:36
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
