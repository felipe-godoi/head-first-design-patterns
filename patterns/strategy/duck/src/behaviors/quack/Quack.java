package behaviors.quack;

import interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("quack!");
  }
}
