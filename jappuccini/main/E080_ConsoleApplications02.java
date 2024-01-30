package jappuccini.main;

import java.util.Scanner;

/**
 * ConsoleApplications02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E080_ConsoleApplications02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine ganze Zahl ein: ");
    int a = sc.nextInt();
    System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
    int b = sc.nextInt();

    double result = 100 * ((double) a / b);

    System.out.println("Ergebnis: " + a + " von " + b + " sind " + result + "%");
    System.out.printf("Ergebnis: %d von %d sind %.2f%%", a, b, result);

  }

}
