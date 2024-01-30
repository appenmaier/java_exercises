package jappuccini.model;

import java.util.ArrayList;

/**
 * Fahrzeugvermietung
 *
 * @author Daniel Appenmaier
 * @version 4.0
 *
 */
public class Rental implements Partner {

  private String name;
  private ArrayList<Vehicle> vehicles;

  public Rental(String name) {
    this.name = name;
    vehicles = new ArrayList<>();
  }

  public void accelerateAllVehicles(int value) throws InvalidValueException {
    for (Vehicle c : vehicles) {
      c.accelerate(value);
    }
  }
  /* version 3.0: - */

  public void addAllVehicles(Vehicle... vehicles) {
    for (Vehicle v : vehicles) {
      this.vehicles.add(v);
    }
  }

  public void addVehicle(Vehicle vehicle) {
    vehicles.add(vehicle);
  }

  public ArrayList<Vehicle> getVehicles() {
    return vehicles;
  }
  /* version 3.0: - */

  @Override
  public void print() {
    System.out.println(name);
    System.out.println("Unsere Fahrzeuge: ");
    for (Vehicle v : vehicles) {
      v.print();
    }
  }

  public void transformAllTrucks() {
    for (Vehicle v : vehicles) {
      if (v instanceof Truck) {
        Truck t = (Truck) v;
        t.transform();
      }
    }
  }
  /* version 1.0: - */

}
/* version 2.0: public class Rental {...} */
