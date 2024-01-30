package koblenz.main;

import java.util.Scanner;

/**
 * Aufgabe C3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E150K_C03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die erste Waehrung ein: ");
    String currency1 = sc.next();

    System.out.print("Gib bitte die zweite Waehrung ein: ");
    String currency2 = sc.next();

    System.out
        .print("Gib bitte den Umrechnungskurs von " + currency1 + " zu " + currency2 + " ein: ");
    double exchangeRate = sc.nextDouble();

    do {
      System.out.print("Gib bitte einen Betrag in " + currency1 + " ein: ");
      double amount = sc.nextDouble();

      double exchangedAmount = amount * exchangeRate;
      System.out
          .println(amount + " " + currency1 + " entsprechen " + exchangedAmount + " " + currency2);

      System.out.print("Moechtest Du einen weiteren Betrag umrechnen (true, false)?: ");
      if (!sc.nextBoolean()) {
        break;
      }
    } while (true);

  }

}
