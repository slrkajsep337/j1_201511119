package com.j1.w9.undo;

public class DVDPlayer {
  public DVDPlayer() {}
  int stop;
  
  public void dvdplay(){ 
    System.out.println("DVDPlayer play"); 
  } 
  public void dvdstop(){
    stop=49;
    System.out.println("DVDPlayer stop"); 
  }
  public void stop() {
    this.stop=stop;
    if(stop==49) {
      System.out.println("Video stops at "+stop+" minutes");
    }
    else {
     dvdplay();
    }
  }
  public int getPoint() {
    return stop;
  }
}