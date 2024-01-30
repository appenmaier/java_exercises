package ulm.model;

/**
 * Konsolendrucker
 *
 * @author Daniel Appenmaier
 * @version 3.0
 * 
 */
public class Printer {

  public static void printChristmasTreeCrown(int height) {
    int width = height * 2 - 1;

    for (int i = 1; i <= width; i += 2) {
      int blanks = width - i;
      for (int j = 1; j <= blanks / 2; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("#");
      }
      for (int j = 1; j <= blanks / 2; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void printChristmasTreeStem(int height, int width, int gap) {
    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= gap; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= width; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }

  public static void printPattern(int numberOfCharacters) {
    for (int i = 0; i < numberOfCharacters / 4; i++) {
      System.out.print(".:|:");
    }
    switch (numberOfCharacters % 4) {
      case 1:
        System.out.print(".");
        break;
      case 2:
        System.out.print(".:");
        break;
      case 3:
        System.out.print(".:|");
        break;
    }
    System.out.println();
  }
  /* version 2.0: - */

  public static void printPatternWithText(String text) {
    for (int i = 0; i < text.length(); i++) {
      System.out.print(".:" + text.charAt(i) + ":");
    }
    System.out.println(".");
  }
  /* version 2.0: - */

  public static void printRectangle(int width, int height) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }
  /* version 1.0: - */

}
