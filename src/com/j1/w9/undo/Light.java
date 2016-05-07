package com.j1.w9.undo;

public class Light {
 int lev;
 public void on() {
  lev=100;
  System.out.println(" light is on");
 }

 public void off() {
  lev=0;
  System.out.println(" light is off");
 }
 public void dim(int lev) {
   this.lev=lev;
   if(lev==0) {
     off();
   }
   else {
     System.out.println("light is dim"+lev);
   }
 }
 public int getLev() {
   return lev;
 }
}