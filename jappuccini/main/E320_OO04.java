package jappuccini.main;

import java.util.ArrayList;
import jappuccini.model.Dice;

/**
 * OO04
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E320_OO04 {

  public static void main(String[] args) {

    ArrayList<Dice> dices = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      Dice dice = new Dice(i + 1);
      dices.add(dice);
    }

    System.out.println("ID - Wuerfelwert");
    for (int i = 0; i < dices.size(); i++) {
      Dice dice = dices.get(i);
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }

  }

}
