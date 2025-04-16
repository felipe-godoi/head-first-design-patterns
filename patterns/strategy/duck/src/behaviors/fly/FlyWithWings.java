package src.behaviors.fly;

import src.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Flying...");
  }
}
