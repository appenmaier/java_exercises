package tutego.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Aufgabe Exception-1.1.1 (ohne java.nio.file.Files)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E640T_I9_111 {

  public static void main(String[] args) {

    File file = new File("src/tutego/resources/family-names.txt");

    try {
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(file);

      int maxLength = 0;
      String longestName = "";

      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        // System.out.println(line + " (" + line.length() + ")" );
        if (line.length() > maxLength) {
          maxLength = line.length();
          longestName = line;
        }
      }

      System.out.println("longestName: " + longestName);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }

}
