package tutego.model;

/**
 * Zahlenfeld
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class IntegerArray {

  public static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      swapValues(array, i, array.length - 1 - i);
    }
  }

  public static void swapValues(int[] array, int index1, int index2) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }

}
