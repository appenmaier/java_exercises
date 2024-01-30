package tutego.model;

import java.util.Comparator;
import tutego.model.Heroes.Hero;

/**
 * HeroByYearFirstAppearanceComparator
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class HeroByYearFirstAppearanceComparator implements Comparator<Hero> {

  @Override
  public int compare(Hero o1, Hero o2) {
    return Integer.compare(o1.yearFirstAppearance, o2.yearFirstAppearance);
  }

}
