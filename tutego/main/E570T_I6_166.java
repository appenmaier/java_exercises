package tutego.main;

import tutego.model.Firebox;

/**
 * Aufgabe OOP-1.6.6
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E570T_I6_166 {

  public static void main(String[] args) {

    Firebox firebox = new Firebox();
    System.out.println("isOn: " + firebox.isOn());

    firebox.off();
    System.out.println("isOn: " + firebox.isOn());

  }

}
