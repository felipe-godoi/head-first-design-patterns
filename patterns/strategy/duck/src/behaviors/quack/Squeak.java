package src.behaviors.quack;

import src.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
