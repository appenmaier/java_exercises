package tutego.main;

import tutego.model.Toaster;

/**
 * Aufgabe OOP-1.6.5
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E560T_I6_165 {

  public static void main(String[] args) {

    Toaster toaster1 = new Toaster();
    Toaster toaster2 = new Toaster();

    boolean isEqual = toaster1.equals(toaster2);
    System.out.println("isEqual: " + isEqual);

  }

}
