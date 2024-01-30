package tutego.main;

import tutego.model.Radio;

/**
 * Aufgabe OOP-1.2.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E420T_I6_121 {

  public static void main(String[] args) {

    Radio radio = new Radio();

    System.out.println(radio.toString());

    radio.on();
    radio.volumeUp();
    radio.volumeUp();
    radio.volumeUp();
    double frequency = Radio.senderToFrequency("DASDING");
    radio.setFrequency(frequency);

    System.out.println(radio.toString());

    radio.volumeDown();
    radio.off();

    System.out.println(radio.toString());

  }

}
