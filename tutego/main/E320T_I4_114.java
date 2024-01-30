package tutego.main;

import java.util.Arrays;
import tutego.model.IntegerArray;

/**
 * Aufgabe Array-1.1.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E320T_I4_114 {

  public static void main(String[] args) {

    int[] array = {7, 2, 1, 9, 4, 1};

    System.out.println("array: " + array);
    System.out.println(Arrays.toString(array));

    IntegerArray.reverseArray(array);

    System.out.println("array: " + array);
    System.out.println(Arrays.toString(array));

  }

}
