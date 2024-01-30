package tutego.main;

import java.util.Scanner;
import tutego.model.Printer;

/**
 * Aufgabe Imperativ-1.5.11
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E210T_I2_1511 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Wiederholungen ein: ");
    int repetitions = sc.nextInt();

    Printer.printFishPattern(repetitions);

  }

}
