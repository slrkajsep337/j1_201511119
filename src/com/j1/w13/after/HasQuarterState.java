package com.j1.w13.after;

public class HasQuarterState implements State {
  GumballMachine gumballMachine;
  
  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  public void insertQuarter() {
    System.out.println("Already insert quarter, Cannot insert another quarter");
  }
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank() {
    System.out.println("You turned lever");
    gumballMachine.setState(gumballMachine.getSoldState());
  }
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
  public String toStirng() {
    return "waiting for turn of crank";
  } /*출력할게 없어서 그냥 주소값이 나오는데 그대신 출력하기위해 설정*/
}