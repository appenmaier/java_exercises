package jappuccini.main;

import java.util.OptionalDouble;

import jappuccini.model.Console;
import jappuccini.model.ConsoleQueries;

/**
 * JavaStreamAPI01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E720_JavaStreamAPI01 {

   public static void main(String[] args) {

      ConsoleQueries queries = new ConsoleQueries(Console.getConsoles());

      queries.getAllCurrentConsoleNames().forEach(System.out::println);
      System.out.println();

      queries.getAllConsolesSortedByLifespan().forEach(System.out::println);
      System.out.println();

      System.out.println(queries.isAnyConsoleWithMoreThan150MillionSoldUnits());
      System.out.println();

      System.out.println(queries.isAllConsolesWithMoreThan50MillionSoldUnits());
      System.out.println();

      System.out.println(queries.getNumberOfConsolesFromNintendo());
      System.out.println();

      queries.getSoldUnitsInMillionsPerYearFromAllOutdatedConsoles().forEach(System.out::println);
      System.out.println();

      OptionalDouble averageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles =
            queries.getAverageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles();
      averageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles.ifPresentOrElse(System.out::println,
            () -> System.out.println("Der Wert konnte nicht berechnet werden"));
      System.out.println();

      queries.getAllConsolesByMaker().forEach((m, cs) -> System.out.println(m + ": " + cs));
      System.out.println();

      queries.getTotalSoldUnitsInMillionsPerMaker()
            .forEach((m, t) -> System.out.println(m + ": " + t));

   }

}
