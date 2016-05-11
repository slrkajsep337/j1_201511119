package com.j1.w10.facade;

public class Projector {
    String description;
    DvdPlayer dvdPlayer;
    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void wideScreenMode() {
        System.out.println(description + " in widescreen mode");
    }
    public String toString() {
        return description;
    }
}