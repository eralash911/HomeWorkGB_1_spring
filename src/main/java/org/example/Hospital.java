package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Human> humanList = new ArrayList<>();
    
    //@Autowired
    private Human human;
    private String name;
    private  int vol;


    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

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
        for (Human h :
                humanList) {
            System.out.println("do: " + h.goTo());
        }
    }


}
