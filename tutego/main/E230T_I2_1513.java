package tutego.main;

import java.util.Scanner;

/**
 * Aufgabe Imperativ-1.5.13
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E230T_I2_1513 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine Zahl ein: ");
    int number = sc.nextInt();

    int tmp = number;
    int counter = 0;
    while (tmp / 10 != 0) {
      tmp = tmp / 10;
      counter++;
    }

    String text = " ";
    for (int i = 0; i < counter; i++) {
      text += " ";
    }
    text += number;
    System.out.println(text);

  }

}
