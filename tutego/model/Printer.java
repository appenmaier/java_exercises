package tutego.model;

/**
 * Konsolendrucker
 *
 * @author Daniel Appenmaier
 * @version 7.0
 * 
 */
public class Printer {

  public static void printBanner(int height) {
    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" " + i);
      }
      System.out.println();
    }
  }
  /* version 3.0: - */

  public static void printCheckerBoard(int width, int height) {
    for (int i = 0; i < height; i++) {
      if (i % 2 == 0) {
        printCheckerBoardLine(width, " _ #");
      } else {
        printCheckerBoardLine(width, " # _");
      }
      System.out.println();
    }
  }
  /* version 4.0: - */

  private static void printCheckerBoardLine(int width, String token) {
    if (width % 2 == 0) {
      for (int i = 0; i < width; i += 2) {
        System.out.print(token);
      }
    } else {
      for (int i = 0; i < width / 2; i++) {
        System.out.print(token);
      }
      System.out.print(" " + token.charAt(1));
    }
  }
  /* version 4.0: - */

  public static void printChristmasTreeWithOrnaments(int width, double frequenzy) {
    for (int i = 1; i <= width; i += 2) {
      int blanks = width - i;
      for (int j = 1; j <= blanks / 2; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        if (j > 1 && j < i && Math.random() < frequenzy) {
          System.out.print("o");
        } else {
          System.out.print("*");
        }
      }
      for (int j = 1; j <= blanks / 2; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  /* version 1.0: - */

  public static void printFishPattern(int repetitions) {
    for (int i = 0; i < repetitions; i++) {
      for (int j = 0; j < repetitions; j++) {
        System.out.print("><>  ");
      }
      for (int j = 0; j < repetitions; j++) {
        System.out.print("<><  ");
      }
      System.out.println();
    }
  }
  /* version 2.0: - */

  public static void printLine(int length) {
    printLine(length, '-');
  }
  /* version 6.0: - */

  public static void printLine(int length, char c) {
    printLine("", length, c, "");
  }
  /* version 6.0: - */

  public static void printLine(String prefix, int length, char c, String suffix) {
    System.out.print(prefix);
    for (int i = 0; i < length; i++) {
      System.out.print(c);
    }
    System.out.println(suffix);
  }
  /* version 6.0: - */

  public static void printLineOfHearts() {
    System.out.println("\u2764\u2764\u2764\u2764\u2764\u2764\u2764\u2764\u2764\u2764");
  }
  /* version 5.0: - */

  public static void printMountain(int[] altitudes) {
    int maxAltitude = altitudes[0];

    for (int altitude : altitudes) {
      if (altitude > maxAltitude) {
        maxAltitude = altitude;
      }
    }

    for (int i = maxAltitude; i >= 0; i--) {
      for (int altitude : altitudes) {
        System.out.print(altitude == i ? "*" : " ");
      }
      System.out.println();
    }
  }

}
