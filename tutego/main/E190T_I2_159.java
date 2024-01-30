package tutego.main;

import java.util.Scanner;
import tutego.model.Printer;

/**
 * Aufgabe Imperativ-1.5.9
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E190T_I2_159 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Breite des Schachbretts ein: ");
    int width = sc.nextInt();

    System.out.print("Gib bitte die Hoehe des Schachbretts ein: ");
    int height = sc.nextInt();

    Printer.printCheckerBoard(width, height);

  }

}
