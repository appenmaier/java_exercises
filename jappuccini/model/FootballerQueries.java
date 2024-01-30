package jappuccini.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * FootballerQueries
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FootballerQueries {

  private static ArrayList<Footballer> footballers = Footballers.getFootballers();

  public static int getTotalOfAllGoalsByMidfielders() {
    int x = footballers.stream()
        .filter(f -> f.position()
            .equals(Position.MIDFIELDER))
        .mapToInt(f -> f.numberOfGoals())
        .sum();

    return x;
  }

  public static Optional<Footballer> getNameOfVfLWolfsburgFootballerWithMostPlayedGames() {
    Optional<Footballer> x = footballers.stream()
        .filter(f -> f.footballClub()
            .equals(new FootballClub("VfL Wolfsburg", 3, 1145)))
        .max((f1, f2) -> Integer.valueOf(f1.numberOfGames())
            .compareTo(f2.numberOfGames()));

    return x;
  }

  public static List<FootballClub> getNameOfAllFootballClubs() {
    List<FootballClub> x = footballers.stream()
        .map(f -> f.footballClub())
        .distinct()
        .toList();

    return x;
  }

  public static boolean isFootballerWithSizeInCmLT170AndNumbreOfGoalsBT0() {
    boolean x = footballers.stream()
        .anyMatch(f -> f.sizeInCm() < 170 && f.numberOfGoals() > 0);

    return x;
  }

  public static Map<Integer, List<Footballer>> getAllFootballersByBirthyear() {
    Map<Integer, List<Footballer>> x = footballers.stream()
        .collect(Collectors.groupingBy(f -> f.birthdate()
            .getYear()));

    return x;
  }

  public static OptionalDouble getAverageNumberOfPointsFromAllBundesligaFootballClubs() {
    OptionalDouble x = footballers.stream()
        .map(f -> f.footballClub())
        .distinct()
        .filter(fc -> fc.positionInAllTimeTable() != -1)
        .mapToInt(fc -> fc.pointsInAllTimeTable())
        .average();

    return x;
  }

}
