package tutego.main;

import tutego.model.Radio;

/**
 * Aufgabe OOP-1.4.2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E440T_I6_142 {

  public static void main(String[] args) {

    Radio radio1 = new Radio("DASDING");
    radio1.on();
    radio1.volumeUp();
    radio1.volumeUp();

    Radio radio2 = new Radio(radio1);

    System.out.println(radio1.toString());
    System.out.println(radio2.toString());

  }

}
