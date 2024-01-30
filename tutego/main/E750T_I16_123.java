package tutego.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import tutego.model.HeroByNameComparator;
import tutego.model.HeroByYearFirstAppearanceComparator;
import tutego.model.Heroes;
import tutego.model.Heroes.Hero;

/**
 * Aufgabe Javalib-1.2.3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E750T_I16_123 {

  public static void main(String[] args) {

    List<Hero> heroes = new ArrayList<>(Heroes.ALL);

    Comparator<Hero> yearFirstAppearanceComparator = new HeroByYearFirstAppearanceComparator();
    Comparator<Hero> nameComparator = new HeroByNameComparator();
    Comparator<Hero> comparator = yearFirstAppearanceComparator.thenComparing(nameComparator);

    heroes.sort(comparator);

    heroes.forEach(t -> System.out.println(t.toString()));

  }

}
