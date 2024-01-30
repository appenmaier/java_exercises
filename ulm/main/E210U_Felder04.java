package ulm.main;

import java.util.Scanner;

/**
 * Aufgabe Felder-4
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E210U_Felder04 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Groesse des Feldes ein: ");
    int length = sc.nextInt();

    int[] numbers = new int[length];

    for (int i = 0; i < length; i++) {
      System.out.print("Gib bitte eine Zahl ein: ");
      int number = sc.nextInt();
      numbers[i] = number;
    }

    boolean loop = true;
    while (loop) {
      System.out.print("Gib bitte den Suchwert ein: ");
      int value = sc.nextInt();

      boolean found = false;
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == value) {
          found = true;
        }
      }
      System.out
          .println(found ? "Der Suchwert wurde gefunden" : "Der Suchwert wurde nicht gefunden");

      System.out.print("Willst Du einen weitere Suchwert eingeben (true, false)?: ");
      loop = sc.nextBoolean();
    }

  }

}
