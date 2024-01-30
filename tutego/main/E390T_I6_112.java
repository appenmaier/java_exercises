package tutego.main;

import tutego.model.Radio;

/**
 * Aufgabe OOP-1.1.2
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class E390T_I6_112 {

  public static void main(String[] args) {

    Radio radio = new Radio();

    System.out.println(radio.toString());

    radio.on();
    radio.volumeUp();
    radio.volumeUp();
    radio.volumeUp();

    System.out.println(radio.toString());

    radio.volumeDown();
    radio.off();

    System.out.println(radio.toString());

    /* version 1.0: radio.volume = 11; radio.isOn = true; */

    System.out.println(radio.toString());

  }

}
