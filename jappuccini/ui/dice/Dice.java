package jappuccini.ui.dice;

import java.util.Random;

public class Dice {

  private int value;

  public Dice() {
    rollTheDice();
  }

  public int getValue() {
    return value;
  }

  public void rollTheDice() {
    value = (new Random()).nextInt(6) + 1;
  }

}
