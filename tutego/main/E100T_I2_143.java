package tutego.main;

import java.util.Scanner;

/**
 * Aufgabe Imperativ-1.4.3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E100T_I2_143 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Menge in Litern ein: ");
    double quantity = sc.nextDouble();

    if (quantity > 1) {
      System.out.println("ca. " + Math.round(quantity) + " l");
    } else if (quantity > 0.1) {
      System.out.println("ca. " + Math.round(quantity * 10) + " cl");
    } else {
      System.out.println("ca. " + Math.round(quantity * 1000) + " ml");
    }

  }

}
