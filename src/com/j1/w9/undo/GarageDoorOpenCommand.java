package com.j1.w9.undo;

public class GarageDoorOpenCommand implements Command {
 GarageDoor door;

 public GarageDoorOpenCommand(GarageDoor door) {
  this.door = door;
 }
 public void execute() {
  door.open();  
 }
 public void undo() {
  }
}