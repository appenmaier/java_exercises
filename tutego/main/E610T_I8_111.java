package tutego.main;

import tutego.model.ElectronicDeviceWattComparator;
import tutego.model.IceMachine;
import tutego.model.Radio;
import tutego.model.TV;

/**
 * Aufgabe Interface-1.1.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E610T_I8_111 {

  public static void main(String[] args) {

    Radio radio1 = new Radio();
    radio1.setWatt(15);

    IceMachine iceMachine = new IceMachine();
    iceMachine.setWatt(150);

    TV tv = new TV();
    tv.setWatt(80);

    ElectronicDeviceWattComparator comparator = new ElectronicDeviceWattComparator();

    int result;

    result = comparator.compare(radio1, iceMachine);
    System.out.println("result: " + result);
    System.out.println();

    result = comparator.compare(iceMachine, tv);
    System.out.println("result: " + result);
    System.out.println();

    result = comparator.compare(tv, radio1);
    System.out.println("result: " + result);
    System.out.println();

  }

}
