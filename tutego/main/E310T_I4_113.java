package tutego.main;

import java.util.Arrays;

/**
 * Aufgabe Array-1.1.3 (ohne Fehlerbehandlung)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E310T_I4_113 {

  public static boolean isProbablyApproaching(String[] array) {
    for (int i = 0; i < array.length; i++) {
      int count = 1;
      for (int j = i + 1; j < array.length; j++) {
        if (array[i].equals(array[j])) {
          count++;
        } else {
          break;
        }
      }
      if (count >= 4) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

    // String[] signs = { "F", "WES", "F", "MOS", "MOS", "MOS", "MOS" };
    // String[] signs = { "MOS", "MOS", "MOS", "MOS", "WES", "WES", "F" };
    // String[] signs = { "MOS", "MOS", "F", "MOS", "WES", "WES", "MOS" };
    String[] signs = {"F", "DO", "MOS", "MOS", "MOS", "MOS", "WES"};

    System.out.println(Arrays.toString(signs));

    boolean isProbablyApproaching = isProbablyApproaching(signs);
    System.out.println("isProbablyApproaching: " + isProbablyApproaching);

  }

}
