package jappuccini.main;

import java.util.Scanner;

/**
 * Loops06
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E200_Loops06 {

  static double calculateInterestPerAnnum(int k, double p) {
    return k * p / 100;
  }

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int k;
    double p;

    boolean loop;
    do {
      System.out.print("Gib bitte das Startkapital ein (in Euro): ");
      k = scanner.nextInt();

      System.out.print("Gib bitte den Prozentsatz ein: ");
      p = scanner.nextDouble();

      System.out.println(
          "Ergebnis: Der Jahreszins betraegt " + (int) calculateInterestPerAnnum(k, p) + " Euro");

      System.out.print("Willst Du einen weiteren Jahreszins berechnen (true, false)?: ");
      loop = scanner.nextBoolean();
    } while (loop);

  }

}
