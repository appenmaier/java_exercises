package tutego.main;

import java.util.ArrayList;
import tutego.model.ElectronicDevice;
import tutego.model.Firebox;
import tutego.model.IceMachine;
import tutego.model.Radio;

/**
 * Aufgabe OOP-1.6.7
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E580T_I6_167 {

  public static void main(String[] args) {

    ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();

    Radio radio = new Radio();
    IceMachine iceMachine = new IceMachine();
    Firebox firebox = new Firebox();

    electronicDevices.add(radio);
    electronicDevices.add(iceMachine);
    electronicDevices.add(firebox);

    for (ElectronicDevice e : electronicDevices) {
      System.out.println(e.toString());
    }

  }

}
