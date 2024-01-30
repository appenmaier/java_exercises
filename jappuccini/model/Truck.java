package jappuccini.model;

/**
 * LKW
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public final class Truck extends Vehicle {

  private int cargo;
  private boolean isTransformed;

  public Truck(String make, String model, Engine engine, int cargo) {
    super(make, model, engine);
    this.cargo = cargo;
  }

  public int getCargo() {
    return cargo;
  }

  public boolean isTransformed() {
    return isTransformed;
  }

  @Override
  public void print() {
    System.out.println(
        getMake() + " " + getModel() + "(" + getEngine().getDescription() + ", " + cargo + "t)");
  }

  public void transform() {
    if (isTransformed) {
      isTransformed = false;
      System.out
          .println(getMake() + " " + getModel() + " verwandelt sich in einen Lastwagen zurück");
    } else {
      isTransformed = true;
      System.out.println(getMake() + " " + getModel() + " verwandelt sich in einen Autobot");
    }
  }

}
/* version 1.0: public class Truck extends Vehicle {...} */
