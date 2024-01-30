package tutego.main;

import java.util.Arrays;

/**
 * Aufgabe Array-1.1.6
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E340T_I4_116 {

  public static int findSplitPoint(int[] array) {
    int totalLeft = 0;
    int totalRight = 0;
    for (int i = 0; i < array.length; i++) {
      totalRight += array[i];
    }

    for (int i = 0; i < array.length - 1; i++) {
      totalLeft += array[i];
      totalRight -= array[i];
      System.out.println(i + ": " + totalLeft + " - " + totalRight);
      if (relativeDifference(totalLeft, totalRight) <= 10) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {

    int[] values = {10, 20, 30, 40, 40, 50};

    System.out.println(Arrays.toString(values));

    int splitPoint = findSplitPoint(values);
    System.out.println("splitPoint: " + splitPoint);

  }

  private static int relativeDifference(int a, int b) {
    if (a == b) {
      return 0;
    }
    int absoluteDifference = Math.abs(a - b);
    return (int) (100.0 * absoluteDifference / Math.max(a, b));
  }

}
