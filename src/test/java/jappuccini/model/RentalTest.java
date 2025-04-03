package jappuccini.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * RentalTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class RentalTest {

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
