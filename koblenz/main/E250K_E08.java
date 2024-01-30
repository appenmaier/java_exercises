package koblenz.main;

import java.util.Arrays;
import java.util.Scanner;
import koblenz.model.IntegerArray;

/**
 * Aufgabe E8 (ohne Fehlerbehandlung)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E250K_E08 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Elemente ein: ");
    int length = sc.nextInt();

    System.out.print("Gib bitte die Grenze fuer die Pseudozufallszahlen ein: ");
    int limit = sc.nextInt();

    int[] numbers = IntegerArray.createArray(length, limit);
    Arrays.sort(numbers);
    IntegerArray.printArrayWithIndices(numbers, false);

    System.out.print("Gib bitte den Suchwert ein: ");
    int value = sc.nextInt();

    int index = IntegerArray.getIndexWithBinarySearch(numbers, value, true);
    System.out.println("Index: " + index);

  }

}
