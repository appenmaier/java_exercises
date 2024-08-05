package jappuccini.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jappuccini.model.Coordinate;
import jappuccini.model.CoordinateByDistanceToOriginPointComparator;

/**
 * Comparators02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E540_Comparators02 {

  public static void main(String[] args) {

    List<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(6, 2));
    coordinates.add(new Coordinate(1, 3));
    coordinates.add(new Coordinate(4, 3));
    coordinates.add(new Coordinate(3, 4));

    Collections.sort(coordinates, new CoordinateByDistanceToOriginPointComparator());

    for (Coordinate c : coordinates) {
      System.out.println(c);
    }
  }

}
