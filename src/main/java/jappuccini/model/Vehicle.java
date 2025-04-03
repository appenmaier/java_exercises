package jappuccini.model;

/**
 * Fahrzeug
 *
 * @author Daniel Appenmaier
 * @version 7.0
 *
 */
public abstract class Vehicle {

   private static int numberOfVehicles;
   /* version 2.0: - */

   public static int getNumberOfVehicles() {
      return numberOfVehicles;
   }
   /* version 2.0: - */

   private String make;
   private String model;
   private Engine engine;
   /* version 3.0: - */
   protected int speedInKmh;
   /* version 4.0: private int speedInKmh */

   public Vehicle(String make, String model, Engine engine) {
      this.make = make;
      this.model = model;
      this.engine = engine;
      numberOfVehicles++;
   }
   /*
    * version 3.0: public Vehicle(String make, String model) { this.make = make; this.model = model;
    * numberOfVehicles++; }
    */
   /*
    * version 2.0: public Vehicle(String make, String model) { this.make = make; this.model = model;
    * }
    */
   /* version 1.0: - */

   public final void accelerate(int valueInKmh) throws InvalidValueException {
      if (valueInKmh <= 0) {
         throw new InvalidValueException("Invalid Value: " + valueInKmh);
      }

      speedInKmh += valueInKmh;
      System.out.println(make + " " + model + " beschleunigt auf " + speedInKmh + " km/h");
   }
   /*
    * version 6.0: public final void accelerate(int valueInKmh) { speedInKmh += valueInKmh;
    * System.out.println(make + " " + model + " beschleunigt auf " + speedInKmh + " km/h"); }
    */
   /*
    * version 5.0: public void accelerate(int valueInKmh) { speedInKmh += valueInKmh;
    * System.out.println(make + " " + model + " beschleunigt auf " + speedInKmh + " km/h"); }
    */

   public final void brake(int valueInKmh) throws InvalidValueException {
      if (valueInKmh <= 0) {
         throw new InvalidValueException("Invalid Value: " + valueInKmh);
      }

      speedInKmh -= valueInKmh;
      System.out.println(make + " " + model + " bremst auf " + speedInKmh + " km/h ab");
   }
   /*
    * version 6.0: public final void brake(int valueInKmh) { speedInKmh -= valueInKmh;
    * System.out.println(make + " " + model + " bremst auf " + speedInKmh + " km/h ab"); }
    */
   /*
    * version 5.0: public void brake(int valueInKmh) { speedInKmh -= valueInKmh;
    * System.out.println(make + " " + model + " bremst auf " + speedInKmh + " km/h ab"); }
    */

   public Engine getEngine() {
      return engine;
   }
   /* version 3.0: - */

   public String getMake() {
      return make;
   }

   public String getModel() {
      return model;
   }

   public int getSpeed() {
      return speedInKmh;
   }

   @Override
   public String toString() {
      return "Vehicle [make=" + make + ", model=" + model + ", engine.description="
            + engine.getDescription() + ", speedInKmh=" + speedInKmh + "]";
   }
   /*
    * version 5.0: public String toString() { return "Vehicle [make=" + make + ", model=" + model +
    * ", engine.description=" + engine.getDescription()+ "]"; }
    */
   /*
    * version 3.0: public String toString() { return "Vehicle [make=" + make + ", model=" + model +
    * "]"; }
    */

   // public void setModel(String model) {
   // this.model = model;
   // }
   /*
    * version 1.0: public void setModel(String model) { this.model = model; }
    */

   // public void setMake(String make) {
   // this.make = make;
   // }
   /*
    * version 1.0: public void setMake(String make) { this.make = make; }
    */

}
/* version 5.0: public class Vehicle {...} */
