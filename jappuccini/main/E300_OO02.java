package jappuccini.main;

import java.util.ArrayList;
import jappuccini.model.Vehicle;

/**
 * OO02
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class E300_OO02 {

  public static void main(String[] args) {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    /*
     * version 1.0: Vehicle vehicle1 = new Vehicle("Porsche", "911"); vehicles.add(vehicle1);
     * Vehicle vehicle2 = new Vehicle("MAN", "TGX"); vehicles.add(vehicle2); Vehicle vehicle3 = new
     * Vehicle("Opel", "Zafira Life"); vehicles.add(vehicle3); vehicle1.accelerate(50);
     * vehicle1.accelerate(50); vehicle1.brake(30);
     */

    for (int i = 0; i < vehicles.size(); i++) {
      Vehicle v = vehicles.get(i);
      v.print();
    }

  }

}
