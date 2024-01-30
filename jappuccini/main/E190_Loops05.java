package jappuccini.main;

import java.util.Random;
import java.util.Scanner;

/**
 * Loops05
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E190_Loops05 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    Random rd = new Random();
    int randomNumber = rd.nextInt(100) + 1;
    // int randomNumber = (int) (Math.random() * 100 + 1);

    int attempts = 0;
    boolean loop;

    do {
      attempts++;

      System.out.print("Gib bitte Deinen Tipp ein: ");
      int tip = sc.nextInt();

      if (tip == randomNumber) {
        System.out.println("Richtig. Du hast " + attempts + " Versuche benötigt");
        break;
      }

      if (tip > randomNumber) {
        System.out.println("Leider falsch, die gesuchte Zahl ist kleiner");
      } else {
        System.out.println("Leider falsch, die gesuchte Zahl ist größer");
      }
      System.out.print("Möchtest Du nochmals raten (true, false)?: ");
      loop = sc.nextBoolean();
    } while (loop);

  }

}
