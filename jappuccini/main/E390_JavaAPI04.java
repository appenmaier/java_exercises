package jappuccini.main;

import java.util.Scanner;

/**
 * JavaAPI04
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E390_JavaAPI04 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte einen Wert zwischen -1 und -32.768 ein: ");
    short s = sc.nextShort();

    System.out
        .println("Ergebnis: Der vorzeichenfreie Dezimalwert betraegt " + Short.toUnsignedInt(s));

  }

}
