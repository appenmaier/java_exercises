package koblenz.main;

import java.util.Scanner;

/**
 * Aufgabe A4
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E040K_A4 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte Deinen Vornamen ein: ");
    String firstName = scanner.next();

    System.out.print("Gib bitte Deinen Nachnamen ein: ");
    String familyName = scanner.next();

    System.out.println(familyName + ", " + firstName);

  }

}
