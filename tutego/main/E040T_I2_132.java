package tutego.main;

import java.util.Scanner;

/**
 * Aufgabe Imperativ-1.3.2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E040T_I2_132 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Anzahl Flaschen ein ");
    int numberOfBottles = sc.nextInt();

    int numberOfBottlesForCiaoCiao = numberOfBottles / 2;
    System.out.println("CiaoCiao bekommt " + numberOfBottlesForCiaoCiao + " Flaschen");

    numberOfBottles -= numberOfBottlesForCiaoCiao;

    System.out.print("Gib bitte die Anzahl Crewmitglieder ein ");
    int numberOfCrewMembers = sc.nextInt();

    if (numberOfBottles % numberOfCrewMembers == 0) {
      System.out.println("Ja, die Flaschen koennen gerecht aufgeteilt werden ("
          + (numberOfBottles / numberOfCrewMembers) + " Flaschen)");
    } else {
      System.out.println("Nein, die Flaschen koennen nicht gerecht aufgeteilt werden");
    }

  }

}
