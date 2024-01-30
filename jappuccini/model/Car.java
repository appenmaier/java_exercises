package jappuccini.model;

/**
 * Auto
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public final class Car extends Vehicle {

  private int seats;

  public Car(String make, String model, Engine engine, int seats) {
    super(make, model, engine);
    this.seats = seats;
  }

  public void doATurboBoost() {
    speed *= 2;
    System.out.println(getMake() + " " + getModel()
        + " macht einen TurboBoost und beschleunigt auf " + speed + " km/h");
  }

  public int getSeats() {
    return seats;
  }

  @Override
  public void print() {
    System.out.println(getMake() + " " + getModel() + "(" + getEngine().getDescription() + ", "
        + seats + "Sitzplaetze)");
  }

}
/* version 1.0: public class Car extends Vehicle {...} */
