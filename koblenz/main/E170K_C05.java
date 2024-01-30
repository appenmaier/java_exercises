package koblenz.main;

import java.util.Scanner;

/**
 * Aufgabe C5
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E170K_C05 {

  public static String combineEZH(int number) {
    int h = number / 100;
    int z = (number - (h * 100)) / 10;
    int e = number - (h * 100) - (z * 10);

    if (h != 0 && z == 0 && e != 0) {
      return eToString(h) + "hundert" + eToString(e);
    } else if (h == 0 && z != 0 && e != 0) {
      return eToString(e) + "und" + zToString(z);
    } else if (h != 0 && z != 0 && e == 0) {
      return eToString(h) + "hundert" + zToString(z);
    } else if (h != 0 && z == 0 && e == 0) {
      return eToString(h) + "hundert";
    } else if (h == 0 && z != 0 && e == 0) {
      return zToString(z);
    } else if (h == 0 && z == 0 && e != 0) {
      return eToString(e);
    } else {
      return eToString(h) + "hundert" + eToString(e) + "und" + zToString(z);
    }
  }

  public static String eToString(int e) {
    String text = "";

    switch (e) {
      case 1:
        text = "ein";
        break;
      case 2:
        text = "zwei";
        break;
      case 3:
        text = "drei";
        break;
      case 4:
        text = "vier";
        break;
      case 5:
        text = "fuenf";
        break;
      case 6:
        text = "sechs";
        break;
      case 7:
        text = "sieben";
        break;
      case 8:
        text = "acht";
        break;
      case 9:
        text = "neun";
        break;
    }

    return text;
  }

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine ganze Zahl ein: ");
    int number = sc.nextInt();

    int m = number / 1000000;
    int t = (number - (m * 1000000)) / 1000;
    int h = number - (m * 1000000) - (t * 1000);

    String mText = m > 0 ? combineEZH(m) + "millionen" : "";
    String tText = t > 0 ? combineEZH(t) + "tausend" : "";
    String hText = combineEZH(h);

    String text = mText + tText + hText;
    text = text.replace("einundzehn", "elf");
    text = text.replace("zweiundzehn", "zwoelf");
    text = text.replace("sechsundzehn", "sechzehn");
    text = text.replace("siebenundzehn", "siebzehn");
    text = text.replace("undzehn", "zehn");
    text = text.replace("millionenein", "millioneneins");
    text = text.replace("tausendein", "tausendeins");
    text = text.replace("hundertein", "hunderteins");

    System.out.println(text);
  }

  public static String zToString(int z) {
    String text = "";

    switch (z) {
      case 1:
        text = "zehn";
        break;
      case 2:
        text = "zwanzig";
        break;
      case 3:
        text = "dreissig";
        break;
      case 4:
        text = "vierzig";
        break;
      case 5:
        text = "fuenfzig";
        break;
      case 6:
        text = "sechszig";
        break;
      case 7:
        text = "siebzig";
        break;
      case 8:
        text = "achtzig";
        break;
      case 9:
        text = "neunzig";
        break;
    }

    return text;
  }

}
