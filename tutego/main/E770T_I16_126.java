package tutego.main;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * AufgabeJavalib-1.2.6
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E770T_I16_126 {

  record Store(String name, Point location) {
  }

  public static List<Store> findStoresAround(Collection<Store> stores, Point center) {
    List<Store> sortedStores = new ArrayList<>(stores);
    sortedStores.sort((o1, o2) -> {
      double distance1 = o1.location.distance(center);
      double distance2 = o2.location.distance(center);
      return Double.compare(distance1, distance2);
    });
    return sortedStores;
  }

  public static void main(String[] args) {

    List<Store> stores =
        List.of(new Store("Aldi", new Point(2, 5)), new Store("Norma", new Point(4, 1)),
            new Store("Lidl", new Point(3, 9)), new Store("Aldi", new Point(4, 7)));
    stores.forEach(t -> System.out.println(t.name + ", " + t.location));

    System.out.println();

    List<Store> sortedStores = findStoresAround(stores, new Point(5, 5));
    sortedStores.forEach(t -> System.out.println(t.name + ", " + t.location));

  }

}
