package condiments;

import beverages.Beverage;

public class Soy extends CondimentDecorator {
  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  public double cost() {
    return 0.15 + beverage.cost();
  }
}
