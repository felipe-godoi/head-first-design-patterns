package src;

import src.behaviors.fly.FlyRocketPowered;
import src.types.Duck;
import src.types.MallardDuck;
import src.types.ModelDuck;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
