package tutego.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import tutego.model.Heroes;
import tutego.model.Heroes.Hero;
import tutego.model.Heroes.Hero.Sex;

/**
 * Aufgabe Streams-1.1.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E800T_II5_111 {

  public static void main(String[] args) {

    List<Hero> heroes = new ArrayList<>(Heroes.ALL);

    /* Terminale Operationen */
    // 1
    System.out.print("Terminal 1: ");
    heroes.stream().forEach(t -> System.out.println(t.toString()));

    // 2
    System.out
        .println("Terminal 2: " + heroes.stream().allMatch(t -> t.yearFirstAppearance > 1900));

    // 3
    System.out.println("Terminal 3: "
        + heroes.stream().anyMatch(t -> t.yearFirstAppearance >= 1960 && t.sex == Hero.Sex.FEMALE));

    // 4
    System.out.println("Terminal 4: " + heroes.stream()
        .min((o1, o2) -> Integer.compare(o1.yearFirstAppearance, o2.yearFirstAppearance)));

    // 5
    System.out.println("Terminal 5: " + heroes.stream().reduce((t, u) -> {
      int difference1 = Math.abs(t.yearFirstAppearance - 1960);
      int difference2 = Math.abs(u.yearFirstAppearance - 1960);
      return difference1 > difference2 ? u : t;
    }));

    // 6
    System.out.print("Terminal 6: ");
    StringBuilder yearFirstAppearances = heroes.stream().collect(StringBuilder::new, (t, u) -> {
      t.append(t.isEmpty() ? "" : ",");
      t.append(u.yearFirstAppearance);
    }, (t, u) -> t.append(u));
    System.out.println(yearFirstAppearances);

    // 7
    System.out.print("Terminal 7: ");
    Map<Sex, List<Hero>> heroesBySex = heroes.stream().collect(Collectors.groupingBy(t -> t.sex));
    System.out.println(heroesBySex);

    // 8
    System.out.print("Terminal 8: ");
    Map<Boolean, List<Hero>> heroesBefore1970 =
        heroes.stream().collect(Collectors.partitioningBy(t -> t.yearFirstAppearance < 1970));
    System.out.println(heroesBefore1970);

    System.out.println();

    /* Intermediaere Operationen */
    // 1
    System.out.println("Intermediate 1: "
        + heroes.stream().filter(t -> t.sex == Sex.FEMALE ? true : false).count());

    // 2
    System.out.println("Intermediate 2: ");
    heroes.stream()
        .sorted((o1, o2) -> Integer.compare(o1.yearFirstAppearance, o2.yearFirstAppearance))
        .forEach(t -> System.out.println(t.toString()));

    // 3a
    System.out.println("Intermediate 3a: ");
    heroes.stream().filter(t -> t.sex == Sex.FEMALE ? true : false).map(t -> t.name)
        .forEach(System.out::println);

    // 3b
    System.out.println("Intermediate 3b: ");
    List<Hero> heroesAnonymized = heroes.stream()
        .map(t -> new Hero(t.name.replaceAll("\\s*\\(.*\\)$", ""), t.sex, t.yearFirstAppearance))
        .collect(Collectors.toList());
    for (Hero h : heroesAnonymized) {
      System.out.println(h.toString());
    }

    // 3c
    System.out.print("Intermediate 3c: ");
    int[] yearFirstAppearances2 =
        heroes.stream().mapToInt(t -> t.yearFirstAppearance).distinct().toArray();
    System.out.println(Arrays.toString(yearFirstAppearances2));

    // 4
    System.out.println("Intermediate 4: ");
    Heroes.UNIVERSES.stream().flatMap(Heroes.Universe::heroes).map(t -> t.name)
        .forEach(System.out::println);

  }

}
