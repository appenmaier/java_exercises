package jappuccini.main;

import java.util.Scanner;

/**
 *
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E220_Loops08 {

  static double calculateInterest(int k, float p, int n) {
    if (n == 0) {
      return k;
    }
    return calculateInterest(k, p, n - 1) * (1 + p / 100);
  }

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    int k;
    float p;
    int n;

    boolean loop;
    do {
      System.out.print("Gib bitte das Startkapital ein (in Euro): ");
      k = scanner.nextInt();

      System.out.print("Gib bitte den Prozentsatz ein: ");
      p = scanner.nextFloat();

      System.out.print("Gib bitte die Anzahl Jahre ein: ");
      n = scanner.nextInt();

      System.out.println(
          "Ergebnis: Das Endkapital betraegt " + (int) calculateInterest(k, p, n) + " Euro");

      System.out.print("Willst Du eine weitere Zinsrechnung durchfuehren (true, false)?: ");
      loop = scanner.nextBoolean();
    } while (loop);

  }

}
