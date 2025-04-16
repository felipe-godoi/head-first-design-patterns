package src.behaviors.quack;

import src.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
