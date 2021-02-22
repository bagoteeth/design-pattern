package com.jrf.designPattern.adapterPattern;

/**
 * @Author ruofa
 * @Date 2021/2/22 11:46
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")){
            System.out.println("playing mp3:"+fileName);
        }
        else if(audioType.equals("vlc")||audioType.equals("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println(audioType+" not supported");
        }
    }
}
