package jappuccini.main;

import jappuccini.model.Car;
import jappuccini.model.Engine;
import jappuccini.model.Rental;
import jappuccini.model.TravelAgency;
import jappuccini.model.Truck;

/**
 * Interfaces01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E520_Interfaces01 {

  public static void main(String[] args) {

    TravelAgency agency = new TravelAgency("Reisebuero Schmidt");

    Rental rental = new Rental("Fahrzeugvermietung Mueller");

    Car car1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
    Truck truck1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
    Car car2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

    rental.addVehicle(car1);
    rental.addVehicle(truck1);
    rental.addVehicle(car2);

    agency.addPartner(rental);

    agency.print();

  }

}
