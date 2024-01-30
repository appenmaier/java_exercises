package jappuccini.main;

import java.util.Scanner;

/**
 * Cases03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E110_Cases03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte den Vornamen ein: ");
    String firstName = sc.next();

    System.out.print("Gib bitte den Nachnamen ein: ");
    String familyName = sc.next();

    System.out.print("Gib bitte das Alter ein: ");
    int age = sc.nextInt();

    System.out.print("Gib bitte das Geschlecht ein (m, w, d): ");
    char gender = sc.next().charAt(0);

    if (gender == 'm' && age > 17) {
      System.out.println("Hallo Herr " + familyName);
    } else if (gender == 'w' && age > 17) {
      System.out.println("Hallo Frau " + familyName);
    } else {
      System.out.println("Hallo " + firstName);
    }

  }

}
