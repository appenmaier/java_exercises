package jappuccini.main;

import java.util.Random;
import java.util.Scanner;

/**
 * ActivityDiagrams01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E460_ActivityDiagrams01 {

  private static Scanner sc = new Scanner(System.in);
  private static int randomNumber;

  public static void main(String[] args) {
    Random random = new Random();
    randomNumber = random.nextInt(100) + 1;
    play();
  }

  private static boolean move(String name) {
    System.out.print(name + ", Tipp eingeben: ");
    int tip = sc.nextInt();

    if (tip == randomNumber) {
      System.out.println(name + ", Sieger");
      return false;
    } else {
      if (tip > randomNumber) {
        System.out.println("Die gesuchte Zahl ist kleiner");
      } else {
        System.out.println("Die gesuchte Zahl ist groesser");
      }
      return true;
    }
  }

  private static void play() {
    System.out.print("Spieler 1, Name eingeben: ");
    String name1 = sc.nextLine();
    System.out.print("Spieler 2, Name eingeben: ");
    String name2 = sc.nextLine();

    boolean loop = true;
    while (loop) {
      loop = move(name1);
      if (loop) {
        loop = move(name2);
      }
    }
  }

}
