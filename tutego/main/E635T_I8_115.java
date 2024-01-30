package tutego.main;

import tutego.model.IceMachine;
import tutego.model.Ship;
import tutego.model.TV;

/**
 * Aufgabe Interface-1.1.5
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E635T_I8_115 {

  public static void main(String[] args) {

    Ship ship = new Ship();
    TV tv1 = new TV();
    TV tv2 = new TV();
    IceMachine iceMachine = new IceMachine();

    tv1.setWatt(80);
    tv2.setWatt(120);
    iceMachine.setWatt(150);

    ship.addAllElectronicDevices(tv1, tv2, iceMachine);
    ship.removePowerConsumingElectronicDevices();

    System.out.println(ship.toString());

  }

}
