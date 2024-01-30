package jappuccini.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import jappuccini.model.Coordinate;

/**
 * InnerClasses04
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E610_InnerClasses04 {

  public static void main(String[] args) {

    ArrayList<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(6, 2));
    coordinates.add(new Coordinate(1, 3));
    coordinates.add(new Coordinate(4, 3));
    coordinates.add(new Coordinate(3, 4));

    Collections.sort(coordinates, new Comparator<Coordinate>() {
      @Override
      public int compare(Coordinate o1, Coordinate o2) {
        return Integer.valueOf(o1.getY()).compareTo(o2.getY());
      }
    });
    for (Coordinate c : coordinates) {
      System.out.println(c);
    }
    System.out.println();

  }

}
