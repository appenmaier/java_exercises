package jappuccini.main;

import jappuccini.model.Vehicle;

/**
 * OO07
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class E350_OO07 {

  public static void main(String[] args) {

    int numberOfVehicles;
    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    /*
     * version 1.0: Vehicle vehicle1 = new Vehicle("Porsche", "911"); Vehicle vehicle2 = new
     * Vehicle("MAN", "TGX"); Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life");
     */

    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    /* version 1.0: vehicle1.print(); vehicle2.print(); vehicle3.print(); */

  }

}
