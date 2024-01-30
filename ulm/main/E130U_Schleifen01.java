package ulm.main;

import java.util.Scanner;

/**
 * Aufgabe Schleifen-1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E130U_Schleifen01 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte einen beliebigen Satz ein: ");
    String text = sc.nextLine();

    System.out.print("Gib bitte die Anzahl Wiederholungen ein: ");
    int loops = sc.nextInt();

    int x = 0;
    while (x < loops) {
      System.out.println(text);
      x++;
    }

    x = 0;
    do {
      System.out.println(text);
      x++;
    } while (x < loops);

    for (int i = 0; i < loops; i++) {
      System.out.println(text);
    }

  }

}
