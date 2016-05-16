package com.j1.w11;

public class BeverageHookTestDrive {
 public static void main(String[] args) {
 
  Tea tea = new Tea();
  Coffee coffee = new Coffee();
 
  System.out.println("<Making tea>");
  tea.prepareRecipe();
  System.out.println("------------------");
  System.out.println("<Making coffee>");
  coffee.prepareRecipe();
  System.out.println("------------------");

 
  TeaWithHook teaHook = new TeaWithHook();
  CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
  System.out.println("<Making tea>");
  teaHook.prepareRecipe();
  System.out.println("--------------------");
  System.out.println("<Making coffee>");
  coffeeHook.prepareRecipe();
 }
}