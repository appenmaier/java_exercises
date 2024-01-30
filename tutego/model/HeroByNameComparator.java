package tutego.model;

import java.util.Comparator;
import tutego.model.Heroes.Hero;

/**
 * HeroByNameComparator
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class HeroByNameComparator implements Comparator<Hero> {

  @Override
  public int compare(Hero o1, Hero o2) {
    return o1.name.compareTo(o2.name);
  }

}
