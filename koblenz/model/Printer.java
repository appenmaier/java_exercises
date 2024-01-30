package koblenz.model;

/**
 * Konsolendrucker
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Printer {

  public static void printChristmasTree(int height) {
    int width = height * 2 - 1;

    /* Krone */
    for (int i = 1; i <= width; i += 2) {
      int blanks = width - i;
      for (int j = 1; j <= blanks / 2; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= blanks / 2; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }

    /* Stamm */
    for (int i = 1; i <= width / 2; i++) {
      System.out.print(" ");
    }
    System.out.print("#");
  }

}
