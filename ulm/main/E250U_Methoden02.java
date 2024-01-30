package ulm.main;

import java.util.Scanner;

/**
 * Aufgabe Methoden-2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E250U_Methoden02 {

  public static boolean isPalindrom(String word) {
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte ein Wort ein: ");
    String word = sc.next();

    boolean isPalindrom = isPalindrom(word);
    System.out.println("isPalindrom: " + isPalindrom);

  }

}
