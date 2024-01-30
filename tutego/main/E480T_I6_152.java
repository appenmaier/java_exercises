package tutego.main;

import tutego.model.Radio;
import tutego.model.Ship;

/**
 * Aufgabe OOP-1.5.2
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class E480T_I6_152 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    Ship ship = new Ship();

    Radio radio1 = new Radio();
    Radio radio2 = new Radio(107.2);
    Radio radio3 = new Radio("DASDING");

    radio1.on();
    radio3.on();

    /* version 1.0: ship.addAllRadios(radio1, radio2, radio3); */

    System.out.println(ship.toString());

  }

}
