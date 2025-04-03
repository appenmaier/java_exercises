package jappuccini.main;

import jappuccini.model.Footballer;
import jappuccini.model.FootballerQueries;

/**
 * JavaStreamAPI02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E730_JavaStreamAPI02 {

   public static void main(String[] args) {

      FootballerQueries queries = new FootballerQueries(Footballer.getFootballers());

      System.out.println("Die Summe aller geschossener Tore von Mittelfeldspielerinnen: "
            + queries.getTotalOfAllGoalsByMidfielders());
      System.out.println();

      System.out.print("Der Name der Spielerin vom VfL Wolfsburg mit den meisten Spielen: ");
      queries.getNameOfVfLWolfsburgFootballerWithMostPlayedGames()
            .ifPresentOrElse(System.out::println, () -> System.out.println("-"));
      System.out.println();

      System.out.println("Die Namen aller Vereine: ");
      queries.getAllFootballClubs().forEach(System.out::println);
      System.out.println();

      System.out.println(
            "Die Antwort auf die Frage, ob es eine Spielerin gibt, die kleiner als 170cm ist und mindestens ein Tor geschossen hat: "
                  + (queries.isFootballerWithSizeInCmLT170AndNumbreOfGoalsBT0() ? "ja" : "nein"));
      System.out.println();

      System.out.println("Alle Spielerinnen gruppiert nach ihrem Geburtsjahr: ");
      queries.getAllFootballersByBirthyear().forEach((y, fs) -> System.out.println(y + ": " + fs));
      System.out.println();

      System.out.print(
            "Die durchschnittliche Punktzahl aller Bundesligamannschaften in der Ewigen Tabelle: ");
      queries.getAverageNumberOfPointsFromAllBundesligaFootballClubs()
            .ifPresentOrElse(System.out::println, () -> System.out.println("-"));
      System.out.println();

   }

}
