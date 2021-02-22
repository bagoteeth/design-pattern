package com.jrf.designPattern.adapterPattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 11:50
 */
public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","aaaaa");
        audioPlayer.play("mp4","bbbbb");
        audioPlayer.play("vlc","ccccc");
        audioPlayer.play("wav","ddddd");
    }
}
