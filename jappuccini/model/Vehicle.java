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

  private Engine engine;
  private String make;
  private String model;
  /* version 3.0: - */
  protected int speed;
  /* version 4.0: private int speed */

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

  public final void accelerate(int value) throws InvalidValueException {
    if (value <= 0) {
      throw new InvalidValueException("Invalid Value: " + value);
    }

    speed += value;
    System.out.println(make + " " + model + " beschleunigt auf " + speed + " km/h");
  }
  /*
   * version 6.0: public final void accelerate(int value) { speed += value; System.out.println(make
   * + " " + model + " beschleunigt auf " + speed + " km/h"); }
   */
  /*
   * version 5.0: public void accelerate(int value) { speed += value; System.out.println(make + " "
   * + model + " beschleunigt auf " + speed + " km/h"); }
   */

  public final void brake(int value) throws InvalidValueException {
    if (value <= 0) {
      throw new InvalidValueException("Invalid Value: " + value);
    }

    speed -= value;
    System.out.println(make + " " + model + " bremst auf " + speed + " km/h ab");
  }
  /*
   * version 6.0: public final void brake(int value) { speed -= value; System.out.println(make + " "
   * + model + " bremst auf " + speed + " km/h ab"); }
   */
  /*
   * version 5.0: public void brake(int value) { speed -= value; System.out.println(make + " " +
   * model + " bremst auf " + speed + " km/h ab"); }
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
    return speed;
  }

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

  public abstract void print();
  /*
   * version 5.0: public void print() { System.out.println(make + " " + model + "(" +
   * engine.getDescription() + ")"); }
   */
  /* version 3.0: public void print() { System.out.println(make + " " + model); } */

}
/* version 5.0: public class Vehicle {...} */
