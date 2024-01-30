package jappuccini.main;

import java.util.Scanner;

/**
 * Loops04
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E180_Loops04 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die erste Zeichenkette ein: ");
    String input1 = sc.nextLine();

    System.out.print("Gib bitte die zweite Zeichenkette ein: ");
    String input2 = sc.nextLine();

    boolean identical = true;

    if (input1.length() != input2.length()) {
      identical = false;
    }

    if (identical) {
      for (int i = 0; i < input1.length(); i++) {
        char char1 = input1.charAt(i);
        char char2 = input2.charAt(i);
        char1 = Character.toUpperCase(char1);
        char2 = Character.toUpperCase(char2);
        if (char1 != char2) {
          identical = false;
          break;
        }
      }
    }

    System.out.println(identical ? "Die beiden Zeichenketten sind identisch"
        : "Die beiden Zeichenketten sind nicht identisch");

  }

}
