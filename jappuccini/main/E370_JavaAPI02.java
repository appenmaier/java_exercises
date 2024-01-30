package jappuccini.main;

import java.util.Scanner;

/**
 * JavaAPI02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E370_JavaAPI02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    double x1 = 0, x2 = 0;

    System.out.print("Gib bitte einen Wert fuer a ein: ");
    double a = sc.nextDouble();
    System.out.print("Gib bitte einen Wert fuer b ein: ");
    double b = sc.nextDouble();
    System.out.print("Gib bitte einen Wert fuer c ein: ");
    double c = sc.nextDouble();

    x1 = ((-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
    x2 = ((-b - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));

    System.out.printf("x1 = %.1f%n", x1);
    System.out.printf("x2 = %.1f%n", x2);

  }

}
