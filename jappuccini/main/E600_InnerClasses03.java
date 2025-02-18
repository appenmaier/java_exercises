package jappuccini.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jappuccini.model.Coordinate;

/**
 * InnerClasses03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E600_InnerClasses03 {

   public static void main(String[] args) {

      List<Coordinate> coordinates = new ArrayList<>();
      coordinates.add(new Coordinate(6, 2));
      coordinates.add(new Coordinate(1, 3));
      coordinates.add(new Coordinate(4, 3));
      coordinates.add(new Coordinate(3, 4));

      class CoordinateByXAscendingComparator implements Comparator<Coordinate> {

         @Override
         public int compare(Coordinate o1, Coordinate o2) {
            return Integer.compare(o1.getX(), o2.getX());
         }

      }

      Collections.sort(coordinates, new CoordinateByXAscendingComparator());

      for (Coordinate c : coordinates) {
         System.out.println(c);
      }

   }

}
