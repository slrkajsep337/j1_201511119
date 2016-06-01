package com.j1.w13.after;

public class NoQuarterState implements State {
  GumballMachine gumballMachine;
  
  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  public void insertQuarter() {
    System.out.println("Thanks! You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }
  public void ejectQuarter() {
    System.out.println("return nothing, please insert quarter");
  }
  public void turnCrank() {
    System.out.println("You turned lever, but there's no quarter");
  }
  public void dispense() {
    System.out.println("You need to insert quarter first");
  }
  public String toString() {
    return "waiting for quarter";
  }
}