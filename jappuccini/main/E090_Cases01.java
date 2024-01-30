package jappuccini.main;

import java.util.Scanner;

/**
 * Cases01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E090_Cases01 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine ganze Zahl ein: ");
    int number = sc.nextInt();

    if (number % 2 == 0) {
      System.out.println("Ergebnis: Die eingegebene Zahl ist gerade");
    } else {
      System.out.println("Ergebnis: Die eingegebene Zahl ist ungerade");
    }

  }

}
