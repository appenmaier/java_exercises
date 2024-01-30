package tutego.main;

import java.util.Scanner;

/**
 * Aufgabe Imperativ-1.5.6
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E160T_I2_156 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine natuerliche Zahl ein: ");
    int n = sc.nextInt();

    int tmp = n;

    int i = 2;
    while (tmp > 1) {
      if (tmp % i != 0) {
        System.out.println(n + " stellt keine Fakultaet dar");
        return;
      }
      tmp = tmp / i;
      i++;
    }

    System.out.println(n + " = " + (i - 1) + "!");

  }

}
