package com.jrf.designPattern.adapterPattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 11:40
 */
public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equals("vlc")){
            advancedMediaPlayer=new VlcPlayer();
        }
        else if(audioType.equals("mp4")){
            advancedMediaPlayer=new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equals("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
