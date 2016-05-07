package com.j1.w9.undo;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
    
    Light light = new Light();
    
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);
    
    remoteControl.setCommand(0, lightOn, lightOff);
 
    remoteControl.onButtonWasPushed(0);
    //remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
    //remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
  }
}