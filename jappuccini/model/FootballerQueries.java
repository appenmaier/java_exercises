package jappuccini.model;

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
public record FootballerQueries(List<Footballer> footballers) {

  public int getTotalOfAllGoalsByMidfielders() {
    int totalGoals = footballers.stream()
        .filter(f -> f.position().equals(Position.MIDFIELDER))
        .mapToInt(f -> f.numberOfGoals())
        .sum();

    return totalGoals;
  }

  public Optional<String> getNameOfVfLWolfsburgFootballerWithMostPlayedGames() {
    Optional<String> name = footballers.stream()
        .filter(f -> f.footballClub().equals(new FootballClub("VfL Wolfsburg", 3, 1145)))
        .sorted((f1, f2) -> Integer.compare(f1.numberOfGames(), f2.numberOfGames()))
        .map(Footballer::name)
        .findAny();

    return name;
  }

  public List<FootballClub> getAllFootballClubs() {
    List<FootballClub> footballClubs =
        footballers.stream().map(Footballer::footballClub).distinct().toList();

    return footballClubs;
  }

  public boolean isFootballerWithSizeInCmLT170AndNumbreOfGoalsBT0() {
    boolean exists =
        footballers.stream().anyMatch(f -> f.sizeInCm() < 170 && f.numberOfGoals() > 0);

    return exists;
  }

  public Map<Integer, List<Footballer>> getAllFootballersByBirthyear() {
    Map<Integer, List<Footballer>> footballersByBirthyear =
        footballers.stream().collect(Collectors.groupingBy(f -> f.birthdate().getYear()));

    return footballersByBirthyear;
  }

  public OptionalDouble getAverageNumberOfPointsFromAllBundesligaFootballClubs() {
    OptionalDouble averageNumberOfPoints = footballers.stream()
        .map(Footballer::footballClub)
        .distinct()
        .filter(fc -> fc.positionInAllTimeTable() != -1)
        .mapToInt(FootballClub::pointsInAllTimeTable)
        .average();

    return averageNumberOfPoints;
  }

}
