package behaviors.fly;

import interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Flying...");
  }
}
