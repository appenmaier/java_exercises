package ulm.main;

import java.util.Scanner;

/**
 * Aufgabe Verzweigungen-5
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E120U_Verzweigungen05 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte eine Jahreszahl ein: ");
    int year = scanner.nextInt();

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + " ist ein Schaltjahr");
    } else {
      System.out.println(year + " ist kein Schaltjahr");
    }

  }

}
