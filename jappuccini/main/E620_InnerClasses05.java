package jappuccini.main;

import java.util.ArrayList;
import java.util.Collections;
import jappuccini.model.Coordinate;

/**
 * InnerClasses05
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E620_InnerClasses05 {

  public static void main(String[] args) {

    ArrayList<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(6, 2));
    coordinates.add(new Coordinate(1, 3));
    coordinates.add(new Coordinate(4, 3));
    coordinates.add(new Coordinate(3, 4));

    Collections.sort(coordinates, (o1, o2) -> {
      return Integer.valueOf(o2.getX()).compareTo(o1.getX());
    });
    for (Coordinate c : coordinates) {
      System.out.println(c);
    }

  }

}
