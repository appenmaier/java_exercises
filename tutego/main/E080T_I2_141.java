package tutego.main;

import java.util.Scanner;

/**
 * Aufgabe Imperativ-1.4.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E080T_I2_141 {

  final static double HIGH_DEVIATION_LIMIT = 1200;
  final static double LOW_DEVIATION_LIMIT = 900;

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte den Betrag ein, den Du Bonny geben moechtest: ");
    int amount = sc.nextInt();

    if (amount > HIGH_DEVIATION_LIMIT || amount < LOW_DEVIATION_LIMIT) {
      System.out.println("You son of a bi***!");
    } else {
      System.out.println("Good boy!");
    }

  }

}
