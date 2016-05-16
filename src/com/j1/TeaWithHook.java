package com.j1.w11;
import java.util.Scanner;

public class TeaWithHook extends CaffeineBeverageWithHook {
  public void brew() {
    System.out.println("steep tea bag");
  }
  public void addCondiments() {
    System.out.println("Adding lemon");
  }
  public boolean customerWantsCondiments() {
    String answer;
    Scanner input = new Scanner(System.in);
    System.out.println("Would you like lemon in tea?");
    answer = input.nextLine();
    
    if(answer=="y")
      return true;
    else
      return false;
  }
}
               
