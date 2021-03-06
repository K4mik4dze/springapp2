package ru.constantin.testspring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer(){}

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        for (Music list: musicList) {
            System.out.println("Song - " + list.getSong());
        }
//        System.out.println("Playing: " + music.getSong());
    }

}
