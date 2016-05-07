package com.j1.w9.undo;

public class LightOnCommand implements Command {
  Light light;
  public LightOnCommand(Light light) {
    this.light = light;
  }
  int lev;
  public void execute() {
    lev=light.getLev();
    light.on();
  }
  public void undo() {
    light.dim(lev);
  }
}