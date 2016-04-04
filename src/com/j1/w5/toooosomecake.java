package headfirst.decorator.starbuzz;
  
abstract class Cake {
  String description="Mystery cake";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}

class Cr_cake extends Cake {
  public Cr_cake() {
    description="Carrot cake";
  }
  public double cost() {
    return 6;
  }
}

class Ch_cake extends Cake {
  public Ch_cake() {
    description="Choco cake";
  }
  public double cost() {
    return 5.5;
  }
}

abstract class CondimentDecorator extends Cake {
  public abstract String getDescription();
}

class Cheese extends CondimentDecorator {
  Cake cake;
  public Cheese(Cake c) {
    cake=c;
  }
  public String getDescription() {
    return cake.getDescription()+", Cheese";
  }
  public double cost() {
    return cake.cost()+ .9;
  }
}
class Whip extends CondimentDecorator {
  Cake cake;
  public Whip(Cake c) {
    cake=c;
  }
  public String getDescription() {
    return cake.getDescription()+".Whip";
  }
  public double cost() {
    return cake.cost() +.5;
  }
}

public class toooosomecake{
  public static void main (String args[]) {
    Cake c=new Ch_cake();
    
    Cake cs = new Cheese(c);
    Cake wcc =new Whip(cs);
    //Beverage wmd = new Whip(new Cheese(new Cr_cake()));
    System.out.println(wcc.getDescription());
    System.out.println(wcc.cost());
  }
}
      