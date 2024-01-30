package jappuccini.main;

import java.util.Scanner;

/**
 * Cases06
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E140_Cases06 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte Deinen Nachnamen ein: ");
    String name = sc.next();

    System.out.print("Gib bitte Dein Geschlecht (m, w, d) ein: ");
    String gender = sc.next();

    String form = switch (gender) {
      case "m" -> "Herr";
      case "w" -> "Frau";
      default -> "";
    };

    // if (gender.equals("m")) {
    // form = "Herr";
    // } else if (gender.equals("w")) {
    // form = "Frau";
    // } else {
    // form = "";
    // }

    String tmp = form.length() == 0 ? "" : " " + form;
    System.out.printf("Hallo %s%s", tmp, name);

  }

}
