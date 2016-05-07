package com.j1.w9.undo;

public class GarageDoorCloseCommand implements Command {
 GarageDoor door;

 public GarageDoorCloseCommand(GarageDoor door) {
  this.door = door;
 }
 public void execute() {
  door.close();  
 }
 public void undo() {
  }
}