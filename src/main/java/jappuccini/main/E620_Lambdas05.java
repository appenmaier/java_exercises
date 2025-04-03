package jappuccini.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jappuccini.model.Coordinate;

/**
 * Lambdas05
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E620_Lambdas05 {

   public static void main(String[] args) {

      List<Coordinate> coordinates = new ArrayList<>();
      coordinates.add(new Coordinate(6, 2));
      coordinates.add(new Coordinate(1, 3));
      coordinates.add(new Coordinate(4, 3));
      coordinates.add(new Coordinate(3, 4));

      Collections.sort(coordinates, (o1, o2) -> Integer.compare(o2.getX(), o1.getX()));

      coordinates.forEach(System.out::println);

   }

}
