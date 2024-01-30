package tutego.main;

import java.util.Scanner;
import tutego.model.CandyType;

/**
 * Aufgabe Interface-1.2.1 (ohne Optionals)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E490T_I8_121 {

  public static CandyType fromName(String name) {
    String value;
    value = name.toUpperCase();
    value = value.replace(" ", "_");
    for (CandyType c : CandyType.values()) {
      if (c.name().equals(value)) {
        return c;
      }
    }
    return null;
  }

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine Suessigkeitenart ein: ");
    String name = sc.nextLine();

    CandyType candyType = fromName(name);
    System.out.println("candyType: " + candyType);

  }

}
