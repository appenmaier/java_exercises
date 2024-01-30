package tutego.main;

import java.util.Arrays;

/**
 * Aufgabe Exception-1.1.3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E660T_I9_113 {

  public static void main(String[] args) {

    String[] strings = {"1", "234", "333"};
    System.out.println(Arrays.toString(parseInts(strings)));
    System.out.println(Arrays.toString(parseInts("1", "234", "333")));
    System.out.println(Arrays.toString(parseInts("1", "ll234", "3", null, "99")));
    System.out.println(Arrays.toString(parseInts("Person", "Woman", "Man", "Camera, TV")));

  }

  public static int[] parseInts(String... numbers) {
    int[] convertedNumbers = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      int number;
      try {
        number = Integer.parseInt(numbers[i]);
      } catch (NumberFormatException e) {
        number = 0;
      }
      convertedNumbers[i] = number;
    }
    return convertedNumbers;
  }

}
