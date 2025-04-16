package src.behaviors.quack;

import src.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("quack!");
  }
}
