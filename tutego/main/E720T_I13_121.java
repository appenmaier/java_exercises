package tutego.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Aufgabe Lambda-1.2.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E720T_I13_121 {

  record City(String name, int population) {
  };

  public static void main(String[] args) {

    List<City> cityTour = new ArrayList<>();
    cityTour.add(new City("Gotham (cathedral)", 8000000));
    cityTour.add(new City("Metropolis (pleasure garden)", 1600000));
    cityTour.add(new City("Hogsmeade (shopping street)", 1124));

    cityTour.removeIf(t -> t.population < 10000);
    cityTour.replaceAll(t -> new City(t.name.replaceAll("\\s*\\(.*\\)$", ""), t.population));
    cityTour.forEach(t -> System.out.println(t.name + "," + t.population));

  }

}
