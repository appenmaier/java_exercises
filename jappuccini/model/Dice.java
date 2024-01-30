package jappuccini.model;

import java.util.Random;

/**
 * Wuerfel
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class Dice {

  private int id;
  protected int value;
  /* version 1.0: private int value; */

  public Dice(int id) {
    this.id = id;
    rollTheDice();
  }

  public int getId() {
    return id;
  }

  public int getValue() {
    return value;
  }

  public void rollTheDice() {
    Random random = new Random();
    value = random.nextInt(6) + 1;
  }

}
