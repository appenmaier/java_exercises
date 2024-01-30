package koblenz.main;

import java.util.Scanner;
import koblenz.model.Calculator;

/**
 * Aufgabe C2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E140K_C02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Bitte gib einen Wert fuer m ein: ");
    int m = sc.nextInt();

    System.out.print("Bitte gib einen Wert fuer n ein: ");
    int n = sc.nextInt();

    int total1 = Calculator.calculateSumWithWile(m, n);
    int total2 = Calculator.calculateSumWithDoWile(m, n);
    int total3 = Calculator.calculateSumWithFor(m, n);

    System.out.println("total1: " + total1);
    System.out.println("total2: " + total2);
    System.out.println("total3: " + total3);

  }

}
