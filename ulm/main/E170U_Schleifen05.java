package ulm.main;

import java.util.Scanner;
import ulm.model.Printer;

/**
 * Aufgabe Schleifen-5
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E170U_Schleifen05 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine Anzahl Zeichen ein: ");
    int numberOfCharacters = sc.nextInt();

    Printer.printPattern(numberOfCharacters);

    System.out.print("Gib bitte eine Zeichenkette ein: ");
    String text = sc.next();

    Printer.printPatternWithText(text);

  }

}
