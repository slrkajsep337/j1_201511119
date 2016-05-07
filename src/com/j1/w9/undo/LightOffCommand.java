package com.j1.w9.undo;

public class LightOffCommand implements Command {
  Light light;
  public LightOffCommand(Light light) {
    this.light = light;
  }
  int lev;
  public void execute() {
    lev=light.getLev();
    light.off();
  }
  public void undo() {
    light.dim(lev);
  }
}