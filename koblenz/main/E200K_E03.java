package koblenz.main;

import java.util.Scanner;
import koblenz.model.IntegerArray;

/**
 * Aufgabe E3 (ohne Fehlerbehandlung)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E200K_E03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Elemente ein: ");
    int length = sc.nextInt();

    System.out.print("Gib bitte die Grenze fuer die Pseudozufallszahlen ein: ");
    int limit = sc.nextInt();

    int[] numbers = IntegerArray.createArray(length, limit);
    IntegerArray.printArrayWithIndices(numbers, false);

    System.out.print("Gib bitte den ersten Index ein: ");
    int index1 = sc.nextInt();

    System.out.print("Gib bitte den zweiten Index ein: ");
    int index2 = sc.nextInt();

    IntegerArray.swapValues(numbers, index1, index2);
    IntegerArray.printArrayWithIndices(numbers, false);

  }

}
