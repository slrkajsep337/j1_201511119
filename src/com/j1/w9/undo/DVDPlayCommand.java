package com.j1.w9.undo;

public class DVDPlayCommand implements Command {
  DVDPlayer dvdplayer;
  int stop;
  public DVDPlayCommand(DVDPlayer dvdplayer) {
    this.dvdplayer=dvdplayer;
  }
  public void execute() {
    stop=dvdplayer.getPoint();
    dvdplayer.dvdplay();
  }
  public void undo() {}
}