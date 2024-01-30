package jappuccini.main;

import java.util.Scanner;

/**
 * Arrays03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E250_Arrays03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine ISBN ohne Pruefziffer ein: ");
    String input = sc.next();

    int[] isbn = new int[input.length()];
    for (int i = 0; i < input.length(); i++) {
      isbn[i] = Character.getNumericValue(input.charAt(i));
    }

    int checkDigit = (10 - ((isbn[0] + isbn[2] + isbn[4] + isbn[6] + isbn[8] + isbn[10]
        + 3 * (isbn[1] + isbn[3] + isbn[5] + isbn[7] + isbn[9] + isbn[11])) % 10)) % 10;

    System.out.println("Ergebnis: Die Pruefziffer lautet " + checkDigit);

  }

}
