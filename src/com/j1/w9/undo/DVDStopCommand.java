package com.j1.w9.undo;

public class DVDStopCommand implements Command {
  DVDPlayer dvdplayer;
  int stop;
  public DVDStopCommand(DVDPlayer dvdplayer) {
    this.dvdplayer=dvdplayer;
  }
  public void execute() {
    stop=dvdplayer.getPoint();
    dvdplayer.dvdstop();
  }
  public void undo() {
    dvdplayer.stop();
  }
}