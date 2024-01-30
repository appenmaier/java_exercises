package koblenz.main;

import java.util.Scanner;
import koblenz.model.IntegerArray;

/**
 * Aufgabe E6 (ohne Fehlerbehandlung)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E230K_E06 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Elemente ein: ");
    int length = sc.nextInt();

    System.out.print("Gib bitte die Grenze fuer die Pseudozufallszahlen ein: ");
    int limit = sc.nextInt();

    int[] numbers = IntegerArray.createArray(length, limit);
    IntegerArray.printArrayWithIndices(numbers, false);

    System.out.println("Groesster Wert (Index): " + IntegerArray.getMaxValue(numbers) + " ("
        + IntegerArray.getMaxValueIndex(numbers) + ")");
    System.out.println("Kleinster Wert (Index): " + IntegerArray.getMinValue(numbers) + " ("
        + IntegerArray.getMinValueIndex(numbers) + ")");

  }

}
