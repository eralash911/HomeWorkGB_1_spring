package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Hospital {
    @Autowired
    private Human human;

    public void doSmth(){
        System.out.println("Do smth: " + human.goTo());
    }


}
