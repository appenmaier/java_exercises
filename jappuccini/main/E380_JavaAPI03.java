package jappuccini.main;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * JavaAPI03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E380_JavaAPI03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte ein Datum ein (dd.mm.yyyy): ");
    String input = sc.next();

    int day = Integer.valueOf(input.substring(0, 2));
    int month = Integer.valueOf(input.substring(3, 5));
    int year = Integer.valueOf(input.substring(6, 10));

    LocalDate inputDate, christmasDate, silvesterDate;
    int dayOfInputDate, dayOfChristmasDate, dayOfSilvesterDate;
    int daysTillChristmas;

    inputDate = LocalDate.of(year, month, day);
    dayOfInputDate = inputDate.getDayOfYear();

    if (month == 12 && day > 24) {
      christmasDate = LocalDate.of(year + 1, 12, 24);
      dayOfChristmasDate = christmasDate.getDayOfYear();

      silvesterDate = LocalDate.of(year, 12, 31);
      dayOfSilvesterDate = silvesterDate.getDayOfYear();

      daysTillChristmas = dayOfSilvesterDate - dayOfInputDate + dayOfChristmasDate;
    } else {
      christmasDate = LocalDate.of(year, 12, 24);
      dayOfChristmasDate = christmasDate.getDayOfYear();

      daysTillChristmas = dayOfChristmasDate - dayOfInputDate;
    }

    System.out.println("Wochentag: " + christmasDate.getDayOfWeek());
    System.out.println("Tage bis Weihnachten: " + daysTillChristmas);

  }

}
