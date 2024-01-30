package koblenz.main;

import java.util.Scanner;
import koblenz.model.IntegerArray;

/**
 * Aufgabe E2 (ohne Fehlerbehandlung)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E190K_E02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Elemente ein: ");
    int length = sc.nextInt();

    int[] numbers = new int[length];

    for (int i = 0; i < numbers.length; i++) {
      numbers[length - 1 - i] = i + 1;
    }

    IntegerArray.printArray(numbers, false);

    System.out.print("Gib bitte einen Wert ein: ");
    int value = sc.nextInt();

    int index = IntegerArray.getIndex(numbers, value);
    System.out.println("Index: " + index);

  }

}
