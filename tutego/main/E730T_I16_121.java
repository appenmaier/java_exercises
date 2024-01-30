package tutego.main;

import java.util.ArrayList;
import java.util.List;
import tutego.model.Heroes;
import tutego.model.Heroes.Hero;

/**
 * Aufgabe Javalib-1.2.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E730T_I16_121 {

  public static void main(String[] args) {

    List<Hero> heroes = new ArrayList<>(Heroes.ALL);

    for (Hero h : heroes) {
      System.out.println(h);
    }

  }

}
