package koblenz.main;

import java.util.Random;
import koblenz.model.IntegerArray;

/**
 * Aufgabe E9 (ohne Fehlerbehandlung)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E260K_E09 {

  public static void main(String[] args) {

    int[] numbers = new int[6];

    Random rnd = new Random();
    int counter = 0;

    while (counter < 6) {
      int randomNumber = rnd.nextInt(49) + 1;
      if (IntegerArray.getIndex(numbers, randomNumber) == -1) {
        numbers[counter] = randomNumber;
        counter++;
      }
    }

    IntegerArray.printArray(numbers, true);

  }

}
