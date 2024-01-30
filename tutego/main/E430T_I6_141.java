package tutego.main;

import tutego.model.Radio;

/**
 * Aufgabe OOP-1.4.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E430T_I6_141 {

  public static void main(String[] args) {

    Radio radio1 = new Radio(107.2);
    Radio radio2 = new Radio();
    Radio radio3 = new Radio("DASDING");

    System.out.println(radio1.toString());
    System.out.println(radio2.toString());
    System.out.println(radio3.toString());

  }

}
