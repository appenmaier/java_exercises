package tutego.main;

import java.util.Scanner;

/**
 * Aufgabe Imperativ-1.3.3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E050T_I2_133 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine zweistellige Zahl ein: ");
    String number1 = sc.next();

    System.out.print("Gib bitte eine weitere zweistellige Zahl ein: ");
    String number2 = sc.next();

    char digit1Number1 = number1.charAt(0);
    char digit2Number1 = number1.charAt(1);
    char digit1Number2 = number2.charAt(0);
    char digit2Number2 = number2.charAt(1);

    if (digit1Number1 == digit1Number2 && digit2Number1 == digit2Number2) {
      System.out.println("Die Zahlen haben zwei gemeinsame Ziffern");
    } else if (digit1Number1 == digit1Number2 || digit1Number1 == digit2Number2
        || digit2Number1 == digit1Number2 || digit2Number1 == digit2Number2) {
      System.out.println("Die Zahlen haben eine gemeinsame Ziffer");
    } else {
      System.out.println("Die Zahlen haben keine gemeinsamen Ziffern");
    }

  }

}
