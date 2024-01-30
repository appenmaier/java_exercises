package jappuccini.main;

import java.util.Scanner;

/**
 * Loops03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E170_Loops03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine Zeichenkette ein: ");
    String text = sc.nextLine();

    System.out.print("Gib bitte das zu analysierende Zeichen ein: ");
    char token = sc.next().charAt(0);

    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == token) {
        count++;
      }
    }
    // int i = 0;
    // while (i < text.length()) {
    // if (text.charAt(i) == token) {
    // count++;
    // }
    // i++;
    // }

    double percentage = count * 100.0 / text.length();

    System.out.printf("Absoluter Anteil: %d%n", count);
    System.out.printf("Prozentualer Anteil: %.2f%%", percentage);

  }

}
