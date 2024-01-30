package jappuccini.main;

/**
 * Operators01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E040_Operators01 {

  public static void main(String[] args) {

    int a = 13, b = 4;
    int quotient, rest;

    quotient = a / b;
    rest = a % b;

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("Ganzzahliger Quotient von a/b: " + quotient);
    System.out.println("Divisionsrest von a/b: " + rest);

  }

}
