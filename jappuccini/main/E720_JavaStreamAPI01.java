package jappuccini.main;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import jappuccini.model.VideoGameConsoleQueries;
import jappuccini.model.VideoGameConsoles.Maker;
import jappuccini.model.VideoGameConsoles.VideoGameConsole;

/**
 * JavaStreamAPI01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E720_JavaStreamAPI01 {

  public static void main(String[] args) {

    VideoGameConsoleQueries.getAllCurrentConsoleNames().forEach(System.out::println);
    System.out.println();

    VideoGameConsoleQueries.getAllConsolesSortedByLifespan().forEach(System.out::println);
    System.out.println();

    System.out.println(VideoGameConsoleQueries.isAnyConsoleWithMoreThan150MillionSoldUnits());
    System.out.println();

    System.out.println(VideoGameConsoleQueries.isAllConsolesWithMoreThan50MillionSoldUnits());
    System.out.println();

    System.out.println(VideoGameConsoleQueries.getNumberOfConsolesFromNintendo());
    System.out.println();

    VideoGameConsoleQueries.getSoldUnitsInMillionsPerYearFromAllOutdatedConsoles()
        .forEach(System.out::println);
    System.out.println();

    OptionalDouble averageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles =
        VideoGameConsoleQueries.getAverageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles();
    averageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles.ifPresentOrElse(System.out::println,
        () -> System.out.println("Der Wert konnte nicht berechnet werden"));
    System.out.println();

    Map<Maker, List<VideoGameConsole>> allConsolesByMaker =
        VideoGameConsoleQueries.getAllConsolesByMaker();
    for (Entry<Maker, List<VideoGameConsole>> entry : allConsolesByMaker.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    System.out.println();

    Map<Maker, Double> totalSoldUnitsInMillionsPerMaker =
        VideoGameConsoleQueries.getTotalSoldUnitsInMillionsPerMaker();
    for (Entry<Maker, Double> entry : totalSoldUnitsInMillionsPerMaker.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

  }

}
