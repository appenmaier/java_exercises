package jappuccini.main;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jappuccini.model.Car;
import jappuccini.model.Engine;
import jappuccini.model.InvalidValueException;
import jappuccini.model.Rental;
import jappuccini.model.Truck;
import jappuccini.model.Vehicle;

/**
 * UnitTests02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E750_UnitTests02 {

  private static Rental rental;

  @BeforeEach
  void setUp() {
    rental = new Rental("Fahrzeugvermietung Mueller");
    rental.addAllVehicles(new Car("Porsche", "911", Engine.ELECTRO, 2),
        new Truck("MAN", "TGX", Engine.DIESEL, 20),
        new Car("Opel", "Zafira Life", Engine.DIESEL, 7));
  }

  @Test
  void testAccelerateAllVehicles() {
    assertThrows(InvalidValueException.class, () -> rental.accelerateAllVehicles(-10));
  }

  @Test
  void testTransformAllTrucks() {
    rental.transformAllTrucks();
    for (Vehicle v : rental.getVehicles()) {
      if (v instanceof Truck t) {
        assertTrue(t.isTransformed());
      }
    }
    rental.transformAllTrucks();
    for (Vehicle v : rental.getVehicles()) {
      if (v instanceof Truck t) {
        assertTrue(!t.isTransformed());
      }
    }
  }

}
