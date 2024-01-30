package tutego.main;

import tutego.model.IceMachine;
import tutego.model.Radio;
import tutego.model.Ship;

/**
 * Aufgabe OOP-1.6.3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E540T_I6_163 {

  public static void main(String[] args) {

    Ship ship = new Ship();
    Radio radio1 = new Radio();
    Radio radio2 = new Radio();
    IceMachine iceMachine = new IceMachine();

    radio1.on();
    iceMachine.on();

    ship.addAllElectronicDevices(radio1, radio2, iceMachine);

    System.out.println(ship.toString());

  }

}
