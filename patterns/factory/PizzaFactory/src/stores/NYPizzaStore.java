package stores;

import pizzas.Pizza;
import pizzas.NY.NYStyleCheesePizza;
import pizzas.NY.NYStyleClamPizza;
import pizzas.NY.NYStylePepperoniPizza;
import pizzas.NY.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

  Pizza createPizza(String item) {
    if (item.equals("cheese")) {
      return new NYStyleCheesePizza();
    } else if (item.equals("veggie")) {
      return new NYStyleVeggiePizza();
    } else if (item.equals("clam")) {
      return new NYStyleClamPizza();
    } else if (item.equals("pepperoni")) {
      return new NYStylePepperoniPizza();
    } else
      return null;
  }
}
