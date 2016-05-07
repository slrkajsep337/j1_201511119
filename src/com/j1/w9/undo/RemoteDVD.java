package com.j1.w9.undo;

public class RemoteDVD {
  public static void main(String[] args) {
    RemoteControlWithUndo rc = new RemoteControlWithUndo();
    
    DVDPlayer dvdPlayer = new DVDPlayer();
    DVDPlayCommand dvdplay = new DVDPlayCommand(dvdPlayer);
    DVDStopCommand dvdstop = new DVDStopCommand(dvdPlayer);
    
    rc.setCommand(0, dvdplay, dvdstop);
 
    rc.onButtonWasPushed(0);
    //rc.offButtonWasPushed(0);
    System.out.println(rc);
    rc.undoButtonWasPushed();
    
    //rc.offButtonWasPushed(0);
    rc.onButtonWasPushed(0);
    System.out.println(rc);
    rc.undoButtonWasPushed();
  }
}