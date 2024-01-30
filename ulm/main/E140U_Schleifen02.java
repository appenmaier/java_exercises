package ulm.main;

import java.util.Random;
import java.util.Scanner;

/**
 * Aufgabe Schleifen-2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E140U_Schleifen02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    Random rnd = new Random();
    int randomNumber = rnd.nextInt(101);

    for (int i = 0; i < 3; i++) {
      System.out.print("Gib bitte Deinen Tipp ein: ");
      int tip = sc.nextInt();

      if (tip > randomNumber) {
        System.out.println("Die gesuchte Zahl ist kleiner");
      } else if (tip < randomNumber) {
        System.out.println("Die gesuchte Zahl ist groesser");
      } else {
        System.out.println("Super, Du hast die gesuchte Zahl erraten");
        return;
      }
    }

    System.out.println("Schade, Du hast die gesuchte Zahl leider nicht erraten");
    System.out.println("Die gesuchte Zahl war " + randomNumber);

  }

}
