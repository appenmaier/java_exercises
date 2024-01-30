package tutego.main;

import tutego.model.ElectronicDevice;
import tutego.model.IceMachine;
import tutego.model.Radio;

/**
 * Aufgabe OOP-1.6.2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E530T_I6_162 {

  public static void main(String[] args) {

    Radio radio1 = new Radio();
    Radio radio2 = new Radio();
    IceMachine iceMachine = new IceMachine();

    radio1.on();
    iceMachine.on();

    int x = ElectronicDevice.numberOfElectronicDevicesSwitchedOn(radio1, iceMachine, radio2);
    System.out.println("x: " + x);

  }

}
