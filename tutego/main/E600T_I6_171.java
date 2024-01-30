package tutego.main;

import tutego.model.Firebox;
import tutego.model.IceMachine;
import tutego.model.Radio;
import tutego.model.Ship;
import tutego.model.TV;

/**
 * Aufgabe OOP-1.7.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E600T_I6_171 {

  public static void main(String[] args) {

    Ship ship = new Ship();
    Radio radio1 = new Radio();
    Radio radio2 = new Radio();
    IceMachine iceMachine = new IceMachine();
    TV tv = new TV();
    Firebox firebox1 = new Firebox();
    Firebox firebox2 = new Firebox();

    radio1.on();
    iceMachine.on();
    tv.on();

    ship.addAllElectronicDevices(radio1, radio2, iceMachine, tv, firebox1, firebox2);
    System.out.println(ship.toString());

    ship.holiday();
    System.out.println(ship.toString());

  }

}
