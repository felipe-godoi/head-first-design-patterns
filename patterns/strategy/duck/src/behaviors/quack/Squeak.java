package behaviors.quack;

import interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
