package jappuccini.model;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import jappuccini.model.Console.Maker;

/**
 * ConsoleQueries
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record ConsoleQueries(List<Console> consoles) {

   public Map<Maker, List<Console>> getAllConsolesByMaker() {
      return consoles.stream().collect(Collectors.groupingBy(c -> c.maker()));
   }

   public List<Console> getAllConsolesSortedByLifespan() {
      return consoles.stream()
            .sorted((c1, c2) -> Integer.compare(c2.lifespan(), c1.lifespan()))
            .toList();
   }

   public List<String> getAllCurrentConsoleNames() {
      return consoles.stream().filter(c -> c.lifespan() == -1).map(Console::title).toList();
   }

   public OptionalDouble getAverageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
      return consoles.stream()
            .filter(c -> c.lifespan() != -1)
            .mapToDouble(c -> c.soldUnitsInMillions() / c.lifespan())
            .average();
   }

   public long getNumberOfConsolesFromNintendo() {
      return consoles.stream().filter(c -> c.maker().equals(Maker.NINTENDO)).count();
   }

   public List<String> getSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
      return consoles.stream()
            .filter(c -> c.lifespan() != -1)
            .map(c -> c.title() + " (" + c.soldUnitsInMillions() / c.lifespan() + ")")
            .toList();
   }

   public Map<Maker, Double> getTotalSoldUnitsInMillionsPerMaker() {
      Map<Maker, List<Console>> allConsolesByMaker = getAllConsolesByMaker();
      return allConsolesByMaker.entrySet()
            .stream()
            .collect(Collectors.toMap(e -> e.getKey(),
                  e -> e.getValue().stream().mapToDouble(c -> c.soldUnitsInMillions()).sum()));
   }

   public boolean isAllConsolesWithMoreThan50MillionSoldUnits() {
      return consoles.stream().allMatch(c -> c.soldUnitsInMillions() > 50);
   }

   public boolean isAnyConsoleWithMoreThan150MillionSoldUnits() {
      return consoles.stream().anyMatch(c -> c.soldUnitsInMillions() > 150);
   }

}
