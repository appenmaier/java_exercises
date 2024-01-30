package ulm.main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Aufgabe Methoden-1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E240U_Methoden01 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Groesse des Feldes ein: ");
    int length = sc.nextInt();

    double[] numbers = new double[length];

    for (int i = 0; i < length; i++) {
      System.out.print("Gib bitte eine Zahl ein: ");
      double number = sc.nextDouble();
      numbers[i] = number;
    }

    System.out.println(Arrays.toString(numbers));

    double minimum = minimum(numbers);
    double maximum = maximum(numbers);
    double mean = mean(numbers);
    System.out.println("minimum: " + minimum);
    System.out.println("maximum: " + maximum);
    System.out.println("mean: " + mean);

  }

  public static double maximum(double[] numbers) {
    double maximum = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > maximum) {
        maximum = numbers[i];
      }
    }
    return maximum;
  }

  public static double mean(double[] numbers) {
    double total = 0;
    for (int i = 0; i < numbers.length; i++) {
      total += numbers[i];
    }
    return total / numbers.length;
  }

  public static double minimum(double[] numbers) {
    double minimum = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < minimum) {
        minimum = numbers[i];
      }
    }
    return minimum;
  }

}
