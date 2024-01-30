package tutego.main;

/**
 * Aufgabe Array-1.4.3 (ohne Fehlerbehandlung)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E370T_I4_143 {

  private static void addValue(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 0) {
        array[i] = value;
        return;
      }
    }
  }

  private static boolean containsFour(int number) {
    if (number == 4) {
      return true;
    } else {
      while (number / 10 != 0) {
        if (number / 10 == 4 || number % 10 == 4) {
          return true;
        }
        number = number / 10;
      }
    }
    return false;
  }

  private static void fourLast(int... numbers) {
    int[] nonFours = new int[numbers.length];
    int[] fours = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      if (containsFour(numbers[i])) {
        addValue(fours, numbers[i]);
      } else {
        addValue(nonFours, numbers[i]);
      }
    }
    print(nonFours);
    print(fours);
  }

  public static void main(String[] args) {

    fourLast(2, 414, 3, 345, 4, 99);

  }

  private static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 0) {
        continue;
      }
      System.out.print(array[i] + " ");
    }
  }

}
