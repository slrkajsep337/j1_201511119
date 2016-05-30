package com.j1.w13;

public class GumballMachine {
  final static int SOLD_OUT = 0;
  final static int NO_QUARTER = 1;
  final static int HAS_QUARTER = 2;
  final static int SOLD = 3;
  
  int state = SOLD_OUT;
  int count = 0;
  
  public GumballMachine(int count) {
    this.count = count;
    if (count > 0) {
      state = NO_QUARTER;
    }
  }
  public void insertQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("You can't insert another quarter");
    } else if (state == NO_QUARTER) {
      state = HAS_QUARTER;
      System.out.println("You inserted a quarter");
    } else if (state == SOLD_OUT) {
      System.out.println("You can't insert a quarter, the machine is sold out!");
    } else if (state == SOLD) {
        System.out.println("Please wait, we're already giving you a gumball");
      }
  }
  public void ejectQuarter() {
    if (state == HAS_QUARTER) {
      state = NO_QUARTER;
      System.out.println("Quarter returned");
    } else if (state == NO_QUARTER) {
      System.out.println("Quarter returned nothing");
    } else if (state == SOLD_OUT) {
      System.out.println("You can't eject");
    } else if (state == SOLD) {
        System.out.println("You already turned the crank");
      }
  }
  public void turnCrank() {
    if (state == SOLD) {
      System.out.println("You already get a gumball");
    } else if (state == NO_QUARTER) {
      System.out.println("You turned, But there's no quarter");
    } else if (state == SOLD_OUT) {
      System.out.println("You turned, But a machine is sold out");
    } else if (state == HAS_QUARTER) {
        System.out.println("Turn right now");
      }
  }
}