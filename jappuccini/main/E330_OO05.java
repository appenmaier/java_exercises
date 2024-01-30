package jappuccini.main;

import java.util.ArrayList;
import jappuccini.model.Dice;
import jappuccini.model.DiceCup;

/**
 * OO05
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E330_OO05 {

  public static void main(String[] args) {

    ArrayList<Dice> dices = new ArrayList<>();

    for (int i = 1; i <= 5; i++) {
      Dice dice = new Dice(i);
      dices.add(dice);
    }

    DiceCup diceCup = new DiceCup();

    System.out.println("ID - Wuerfelwert");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Wurf " + i);
      diceCup.rollTheDices(dices);
    }

  }

}
