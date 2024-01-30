package ulm.main;

import java.util.Scanner;

/**
 * Aufgabe Felder-6
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E230U_Felder06 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    int[] temperatures = new int[14];

    for (int i = 0; i < temperatures.length; i++) {
      System.out.print("Gib bitte die Temperatur fuer den Tag " + i + " ein: ");
      int temperature = sc.nextInt();
      temperatures[i] = temperature;
    }

    System.out.print("Tag:    ");
    for (int i = 0; i < temperatures.length; i++) {
      System.out.printf("%3d", i);
    }
    System.out.println();

    System.out.print("T (Grad C): ");
    for (int i = 0; i < temperatures.length; i++) {
      System.out.printf("%3d", temperatures[i]);
    }
    System.out.println();

    int maxDifference = 0;
    int day1 = 0;
    int day2 = 0;

    for (int i = 0; i < temperatures.length - 1; i++) {
      int difference = Math.abs(temperatures[i] - temperatures[i + 1]);
      if (difference > maxDifference) {
        maxDifference = difference;
        day1 = i;
        day2 = i + 1;
      }
    }

    System.out.println("Hoechster Temperaturunterschied (Tag " + day1 + " auf Tag " + day2 + "): "
        + maxDifference + "Grad C");

  }

}
