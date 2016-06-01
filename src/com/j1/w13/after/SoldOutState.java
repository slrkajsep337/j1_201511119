package com.j1.w13.after;

public class SoldOutState implements State {
  GumballMachine gumballMachine;
  
  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  public void insertQuarter() {
    System.out.println("You can't insert a quarter, the ");
  }
  public void ejectQuarter() {
    System.out.println("Return all quarters");
  }
  public void turnCrank() {
    System.out.println("You turned lever, but no gumball");
  }
  public void dispense() {
    System.out.println("Sorry, no gumball");
  }
  public String toString() {
    return "sold out";
  }
}
                      
                   
  