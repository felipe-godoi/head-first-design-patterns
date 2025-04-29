package stores;

import pizzas.Pizza;
import pizzas.Chicago.ChicagoStyleCheesePizza;
import pizzas.Chicago.ChicagoStyleClamPizza;
import pizzas.Chicago.ChicagoStylePepperoniPizza;
import pizzas.Chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

  Pizza createPizza(String item) {
    if (item.equals("cheese")) {
      return new ChicagoStyleCheesePizza();
    } else if (item.equals("veggie")) {
      return new ChicagoStyleVeggiePizza();
    } else if (item.equals("clam")) {
      return new ChicagoStyleClamPizza();
    } else if (item.equals("pepperoni")) {
      return new ChicagoStylePepperoniPizza();
    } else
      return null;
  }
}
