package jappuccini.main;

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
    System.out.println("Die Summe aller geschossener Tore von Mittelfeldspielerinnen: "
        + FootballerQueries.getTotalOfAllGoalsByMidfielders());
    System.out.println();

    System.out.print("Der Name der Spielerin vom VfL Wolfsburg mit den meisten Spielen: ");
    FootballerQueries.getNameOfVfLWolfsburgFootballerWithMostPlayedGames()
        .ifPresentOrElse(f -> System.out.println(f.name()), () -> System.out.println("-"));
    System.out.println();

    System.out.println("Die Namen aller Vereine: ");
    FootballerQueries.getNameOfAllFootballClubs()
        .forEach(c -> System.out.println(c.name()));
    System.out.println();

    System.out.println(
        "Die Antwort auf die Frage, ob es eine Spielerin gibt, die kleiner als 170cm ist und mindestens ein Tor geschossen hat: "
            + (FootballerQueries.isFootballerWithSizeInCmLT170AndNumbreOfGoalsBT0() ? "ja"
                : "nein"));
    System.out.println();

    System.out.println("Alle Spielerinnen gruppiert nach ihrem Geburtsjahr: ");
    FootballerQueries.getAllFootballersByBirthyear()
        .forEach((y, fs) -> System.out.println(y + ": " + fs));
    System.out.println();

    System.out.print(
        "Die durchschnittliche Punktzahl aller Bundesligamannschaften in der Ewigen Tabelle: ");
    FootballerQueries.getAverageNumberOfPointsFromAllBundesligaFootballClubs()
        .ifPresentOrElse(System.out::println, () -> System.out.println("-"));
    System.out.println();
  }

}
