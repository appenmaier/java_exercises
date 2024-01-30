package jappuccini.main;

import jappuccini.model.Car;
import jappuccini.model.Engine;

/**
 * AbstractAndFinal01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E510_AbstractAndFinal01 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    // Vehicle vehcile = new Vehicle("Porsche", "911");
    Car car = new Car("Porsche", "911", Engine.ELECTRO, 2);

  }

}
