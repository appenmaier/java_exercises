package tutego.main;

import java.util.ArrayList;
import tutego.model.ElectronicDevice;
import tutego.model.IceMachine;
import tutego.model.Radio;

/**
 * Aufgabe OOP-1.6.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E520T_I6_161 {

  public static void main(String[] args) {

    ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();

    Radio radio = new Radio();
    IceMachine iceMachine = new IceMachine();

    electronicDevices.add(radio);
    electronicDevices.add(iceMachine);

    for (ElectronicDevice e : electronicDevices) {
      e.on();
      System.out.println(e.toString());
    }

  }

}
