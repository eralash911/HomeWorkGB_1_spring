package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Hospital {
    //@Autowired
    private Human human;
    private String name;
    private  int vol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public Hospital() {
    }

    public Hospital(Human human) {
        this.human = human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public void doSmth(){
        System.out.println("Do smth: " + human.goTo());
    }


}
