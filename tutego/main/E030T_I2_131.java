package tutego.main;

import java.util.Scanner;

/**
 * Aufgabe Imperativ-1.3.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E030T_I2_131 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine Gleitkommazahl ein: ");
    double amount1 = sc.nextDouble();

    System.out.print("Gib bitte eine weitere Gleitkommazahl ein: ");
    double amount2 = sc.nextDouble();

    System.out.print("Gib bitte eine weitere Gleitkommazahl ein: ");
    double amount3 = sc.nextDouble();

    double totalAmount = amount1 + amount2 + amount3;

    if (totalAmount > 1000000) {
      System.out.println("Ja, die Drei bekommen die Million zusammen");
    } else {
      System.out.println("Nein, die Drei bekommen die Million nicht zusammen");
    }

  }

}
