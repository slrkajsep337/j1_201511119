package com.j1.w11;
import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
  public void brew() {
    System.out.println("brew coffee");
  }
  public void addCondiments() {
    System.out.println("Adding sugar and milk");
  }
  public boolean customerWantsCondiments() {
    String answer;
    Scanner input = new Scanner(System.in);
    System.out.println("Would you like milk and sugar in coffee?");
    answer = input.nextLine();
    
    if(answer=="y")
      return true;
    else
      return false;
  }
}
               
