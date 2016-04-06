package headfirst.factory;

public class PizzaTestDrive {
  public static void main(String[] args){
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    Pizza pizza=store.orderPizza("cheese");
    Pizza pizza2=store.orderPizza("veggie");
  }
}