package ulm.main;

import java.util.Scanner;

/**
 * Aufgabe Schleifen-4
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E160U_Schleifen04 {

  static String player1Name;
  static int player1Points;
  static String player2Name;
  static int player2Points;

  static Scanner sc;

  static String word;

  public static void main(String[] args) {

    sc = new Scanner(System.in);

    System.out.print("Spieler 1, gib bitte Deinen Namen ein: ");
    player1Name = sc.next();

    System.out.print("Spieler 2, gib bitte Deinen Namen ein: ");
    player2Name = sc.next();

    System.out.println("Das Startwort lautet \"wort\"");
    word = "wort";

    int round = 1;
    while (player1Points < 30 && player2Points < 30) {
      System.out.println("Runde " + round);
      System.out.println("Punkte " + player1Name + ": " + player1Points);
      System.out.println("Punkte " + player2Name + ": " + player2Points);

      if (!move(player1Name)) {
        break;
      }
      if (!move(player2Name)) {
        break;
      }

      round++;
      System.out.println();
    }

    System.out.println("Endstand");
    System.out.println("Punkte " + player1Name + ": " + player1Points);
    System.out.println("Punkte " + player2Name + ": " + player2Points);
    if (player1Points > player2Points) {
      System.out.println(player1Name + " gewinnt das Spiel");
    } else {
      System.out.println(player2Name + " gewinnt das Spiel");
    }

  }

  public static boolean move(String playerName) {
    System.out.print(playerName + ", gib bitte ein Wort ein, welches mit "
        + word.charAt(word.length() - 1) + " beginnt: ");
    String input = sc.next();
    input = input.toLowerCase();

    if (input.charAt(0) != word.charAt(word.length() - 1)) {
      System.out.println("Ungueltige Eingabe, " + playerName + " verliert");
      return false;
    }

    word = input;
    System.out.println("Dieses Wort ergibt " + input.length() + " Punkte");
    if (playerName.equals(player1Name)) {
      player1Points += input.length();
    } else {
      player2Points += input.length();
    }
    return true;
  }

}
