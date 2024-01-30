package koblenz.main;

import java.util.Scanner;
import koblenz.model.Printer;

/**
 * Aufgabe C4
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E160K_C04 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Hoehe des Weihnachtsbaumes ein: ");
    int height = sc.nextInt();

    Printer.printChristmasTree(height);

  }

}
