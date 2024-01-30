package jappuccini.main;

import jappuccini.model.Dice;

/**
 * OO03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E310_OO03 {

  public static void main(String[] args) {

    Dice dice1 = new Dice(1);

    System.out.println("ID - Wuerfelwert");
    for (int i = 0; i < 5; i++) {
      dice1.rollTheDice();
      System.out.println(dice1.getId() + " - " + dice1.getValue());
    }

  }

}
