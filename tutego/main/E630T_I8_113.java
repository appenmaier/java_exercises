package tutego.main;

import tutego.model.IceMachine;
import tutego.model.Radio;
import tutego.model.Ship;
import tutego.model.TV;

/**
 * Aufgabe Interface-1.1.3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E630T_I8_113 {

  public static void main(String[] args) {

    Ship ship = new Ship();
    Radio radio1 = new Radio();
    Radio radio2 = new Radio();
    IceMachine iceMachine = new IceMachine();
    TV tv = new TV();

    radio1.setWatt(15);
    radio2.setWatt(10);
    iceMachine.setWatt(150);
    tv.setWatt(80);

    ship.addAllElectronicDevices(radio1, radio2, iceMachine, tv);

    System.out.println(ship.toString());

  }

}
