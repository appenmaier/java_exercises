package ulm.main;

import java.util.Arrays;

/**
 * Aufgabe Felder-3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E200U_Felder03 {

  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println(Arrays.toString(numbers));

    for (int i = 0; i < numbers.length - 1; i++) {
      int tmp = numbers[i];
      numbers[i] = numbers[i + 1];
      numbers[i + 1] = tmp;
    }

    System.out.println(Arrays.toString(numbers));

  }

}
