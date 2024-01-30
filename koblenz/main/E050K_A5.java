package koblenz.main;

import java.util.Scanner;

/**
 * Aufgabe A5
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E050K_A5 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte eine ganze Zahl ein: ");
    int a = scanner.nextInt();

    System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
    int b = scanner.nextInt();

    int c = a + b;

    System.out.println("Die Summe von " + a + " und " + b + " ist " + c + ".");

  }

}
