package jappuccini.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import jappuccini.model.VideoGameConsoles.Maker;
import jappuccini.model.VideoGameConsoles.VideoGameConsole;

/**
 * VideoGameConsoleQueries
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class VideoGameConsoleQueries {

  private static ArrayList<VideoGameConsole> consoles = VideoGameConsoles.getVideoGameConsoles();

  public static Map<Maker, List<VideoGameConsole>> getAllConsolesByMaker() {
    return consoles.stream().collect(Collectors.groupingBy(c -> c.maker()));
  }

  public static List<VideoGameConsole> getAllConsolesSortedByLifespan() {
    return consoles.stream()
        .sorted((c1, c2) -> Integer.valueOf(c2.lifespan()).compareTo(c1.lifespan()))
        .collect(Collectors.toList());
  }

  public static List<String> getAllCurrentConsoleNames() {
    return consoles.stream().filter(c -> c.lifespan() == -1).map(c -> c.title())
        .collect(Collectors.toList());
  }

  public static OptionalDouble getAverageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
    return consoles.stream().filter(c -> c.lifespan() != -1)
        .mapToDouble(c -> c.soldUnitsInMillions() / c.lifespan()).average();
  }

  public static long getNumberOfConsolesFromNintendo() {
    return consoles.stream().filter(c -> c.maker().equals(Maker.NINTENDO)).count();
  }

  public static List<String> getSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
    return consoles.stream().filter(c -> c.lifespan() != -1)
        .map(c -> c.title() + " (" + c.soldUnitsInMillions() / c.lifespan() + ")")
        .collect(Collectors.toList());
  }

  public static Map<Maker, Double> getTotalSoldUnitsInMillionsPerMaker() {
    Map<Maker, List<VideoGameConsole>> allConsolesByMaker = getAllConsolesByMaker();
    return allConsolesByMaker.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(),
        e -> e.getValue().stream().mapToDouble(c -> c.soldUnitsInMillions()).sum()));
  }

  public static boolean isAllConsolesWithMoreThan50MillionSoldUnits() {
    return consoles.stream().allMatch(c -> c.soldUnitsInMillions() > 50);
  }

  public static boolean isAnyConsoleWithMoreThan150MillionSoldUnits() {
    return consoles.stream().anyMatch(c -> c.soldUnitsInMillions() > 150);
  }

}
