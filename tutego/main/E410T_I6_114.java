package tutego.main;

import tutego.model.Radio;

/**
 * Aufgabe OOP-1.1.4
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E410T_I6_114 {

  public static void main(String[] args) {

    Radio radio = new Radio();

    System.out.println(radio.toString());

    radio.on();
    radio.volumeUp();
    radio.volumeUp();
    radio.volumeUp();
    radio.setFrequency(107.2);

    System.out.println(radio.toString());

    radio.volumeDown();
    radio.off();

    System.out.println(radio.toString());

  }

}
