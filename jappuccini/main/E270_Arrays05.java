package jappuccini.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Arrays05
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E270_Arrays05 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    ArrayList<String> tasks = new ArrayList<>();

    System.out.println("Optionen");
    System.out.println("1: Aufgabe hinzufuegen");
    System.out.println("2: Aufgabe loeschen");
    System.out.println("3: Aufgaben ausgeben");
    System.out.println("4: Beenden");
    System.out.println();

    boolean loop = true;
    do {

      System.out.print("Was moechtest Du tun?: ");
      int answer = sc.nextInt();

      switch (answer) {
        case 1:
          System.out.print("Gib bitte die Aufgabenbeschreibung ein: ");
          sc.nextLine();
          String task = sc.nextLine();
          tasks.add(task);
          break;
        case 2:
          System.out.print("Gib bitte ein, welche Aufgabe geloescht werden soll: ");
          int index = sc.nextInt();
          tasks.remove(index);
          break;
        case 3:
          System.out.println();
          System.out.println("Aufgaben");
          for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
          }
          System.out.println();
          break;
        case 4:
          loop = false;
          break;
      }

    } while (loop);

  }

}
