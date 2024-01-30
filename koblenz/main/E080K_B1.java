package koblenz.main;

import java.util.Scanner;

/**
 * Aufgabe B1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E080K_B1 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte einen Wert fuer a ein: ");
    int a = scanner.nextInt();

    System.out.print("Gib bitte einen Wert fuer b ein: ");
    int b = scanner.nextInt();

    int tmp;

    if (a > b) {
      tmp = b;
      b = a;
      a = tmp;
    }

    System.out.println("kleinere Zahl: " + a);
    System.out.println("groessere Zahl: " + b);

  }

}
