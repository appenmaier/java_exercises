package tutego.main;

import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Aufgabe Javalib-1.2.5
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E760T_I16_125 {

  public static void main(String[] args) {

    class PointDistanceToZeroComparator implements Comparator<Point> {
      @Override
      public int compare(Point o1, Point o2) {
        double distance1 = o1.distance(new Point(0, 0));
        double distance2 = o2.distance(new Point(0, 0));
        return Double.compare(distance1, distance2);
      }
    }

    Point[] points = {new Point(9, 3), new Point(3, 4), new Point(4, 3), new Point(1, 2)};
    Arrays.sort(points, new PointDistanceToZeroComparator());
    System.out.println(Arrays.toString(points));

  }

}
