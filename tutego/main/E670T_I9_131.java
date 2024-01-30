package tutego.main;

import tutego.model.IllegalWattException;
import tutego.model.TV;

/**
 * Aufgabe Exception-1.3.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E670T_I9_131 {

  public static void main(String[] args) {

    TV tv1 = new TV();
    TV tv2 = new TV();

    try {
      tv1.setWatt(80);
      tv2.setWatt(-80);
    } catch (IllegalWattException e) {
      System.err.println(e.getMessage());
    }

  }

}
