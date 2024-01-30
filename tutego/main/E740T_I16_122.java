package tutego.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import tutego.model.Heroes;
import tutego.model.Heroes.Hero;

/**
 * Aufgabe Javalib-1.2.2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E740T_I16_122 {

  private static int compareHeroes(Hero h1, Hero h2) {
    int yearComparison = Integer.compare(h1.yearFirstAppearance, h2.yearFirstAppearance);
    return yearComparison != 0 ? yearComparison : h1.name.compareTo(h2.name);
  }

  public static void main(String[] args) {

    List<Hero> heroes = new ArrayList<>(Heroes.ALL);

    /* Lokale Klasse */
    class HeroesByYearFirstAppereanceComparator implements Comparator<Hero> {
      @Override
      public int compare(Hero o1, Hero o2) {
        return compareHeroes(o1, o2);
      }
    }
    heroes.sort(new HeroesByYearFirstAppereanceComparator());

    /* Anonyme Klasse */
    heroes.sort(new Comparator<Hero>() {
      @Override
      public int compare(Hero o1, Hero o2) {
        return compareHeroes(o1, o2);
      }
    });

    /* Lambda Ausdruck */
    heroes.sort((o1, o2) -> compareHeroes(o1, o2));

    heroes.forEach(t -> System.out.println(t.toString()));

  }

}
