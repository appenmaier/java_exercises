package koblenz.model;

/**
 * Zahlenfeld
 * 
 * @author Daniel Appenmaier
 * @version 8.0
 * 
 */
public class IntegerArray {

  public static int[] copyArray(int[] array) {
    int[] copy = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      copy[i] = array[i];
    }

    return copy;
  }
  /* version 4.0: - */

  public static int[] createArray(int length, int limit) {
    int[] array = new int[length];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * limit);
    }

    return array;
  }
  /* version 2.0: - */

  public static int getIndex(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }

    return -1;
  }
  /* version 1.0: - */

  public static int getIndexWithBinarySearch(int[] array, int value, boolean printLRC) {
    int l = 0;
    int r = array.length - 1;
    int c;

    if (printLRC) {
      System.out.println("  l   r   c");
    }

    while (l <= r) {
      c = (l + r) / 2;
      if (printLRC) {
        System.out.printf("%3d %3d %3d%n", l, r, c);
      }
      if (array[c] == value) {
        return c;
      } else if (array[c] > value) {
        r = c - 1;
      } else {
        l = c + 1;
      }
    }

    return -1;
  }
  /* version 7.0: - */

  public static int getMaxValue(int[] array) {
    int maxValue = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > maxValue) {
        maxValue = array[i];
      }
    }

    return maxValue;
  }
  /* version 5.0: - */

  public static int getMaxValueIndex(int[] array) {
    int maxValue = 0;
    int index = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > maxValue) {
        maxValue = array[i];
        index = i;
      }
    }

    return index;
  }
  /* version 5.0: - */

  public static int getMinValue(int[] array) {
    int minValue = Integer.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < minValue) {
        minValue = array[i];
      }
    }

    return minValue;
  }
  /* version 5.0: - */

  public static int getMinValueIndex(int[] array) {
    int minValue = Integer.MAX_VALUE;
    int index = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < minValue) {
        minValue = array[i];
        index = i;
      }
    }

    return index;
  }
  /* version 5.0: - */

  public static void printArray(int[] array, boolean vertical) {
    if (vertical) {
      for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
      }
    } else {
      System.out.print("[");
      for (int i = 0; i < array.length; i++) {
        System.out.print(i == array.length - 1 ? array[i] : array[i] + ", ");
      }
      System.out.println("]");
    }
  }

  public static void printArrayWithIndices(int[] array, boolean vertical) {
    if (vertical) {
      for (int i = 0; i < array.length; i++) {
        System.out.println("i: " + array[i]);
      }
    } else {
      System.out.print(" ");
      for (int i = 0; i < array.length; i++) {
        System.out.printf("%3d ", i);
      }
      System.out.println();
      System.out.print("[");
      for (int i = 0; i < array.length; i++) {
        System.out.printf("%3d ", i == array.length - 1 ? array[i] : array[i]);
      }
      System.out.println("]");
    }
  }
  /* version 2.0: - */

  public static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      swapValues(array, i, array.length - 1 - i);
    }
  }
  /* version 3.0: - */

  public static void sortWithSelectionSort(int[] numbers) {
    for (int i = 0; i < numbers.length - 1; i++) {
      int mininumPosition = i;
      int minimumValue = numbers[mininumPosition];
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < minimumValue) {
          mininumPosition = j;
          minimumValue = numbers[mininumPosition];
        }
      }

      if (mininumPosition != i) {
        numbers[mininumPosition] = numbers[i];
        numbers[i] = minimumValue;
      }
    }
  }
  /* version 6.0: - */

  public static void swapValues(int[] array, int index1, int index2) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }
  /* version 2.0: - */

}
