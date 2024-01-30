package tutego.main;

import tutego.model.Radio;
import tutego.model.Ship;

/**
 * Aufgabe OOP-1.6.4
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E550T_I6_164 {

  public static void main(String[] args) {

    Ship ship = new Ship();
    Radio radio1 = new Radio(107.2);
    Radio radio2 = new Radio();
    Radio radio3 = new Radio();

    radio1.on();
    radio1.volumeUp();
    radio3.volumeUp();

    ship.addAndCheckAllElectronicDevices(radio1, radio2, radio3);
    System.out.println(ship.toString());

  }

}
