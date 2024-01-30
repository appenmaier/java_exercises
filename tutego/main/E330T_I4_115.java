package tutego.main;

import java.awt.Point;
import java.util.Arrays;
import java.util.Random;

/**
 * Aufgabe Array-1.1.5 (ohne Fehlerbehandlung)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E330T_I4_115 {

  public static void main(String[] args) {

    int size = 5;
    int xMax = 10;
    int yMax = 10;

    Random rnd = new Random();

    Point[] points = new Point[size];

    for (int i = 0; i < size; i++) {
      int x = rnd.nextInt(xMax);
      int y = rnd.nextInt(yMax);
      points[i] = new Point(x, y);
    }

    System.out.println(Arrays.toString(points));

    double minDistance = minDistance(points, size);
    System.out.println("minDistance " + minDistance);
    Point minDistancePoint = minDistancePoint(points, size);
    System.out.println("minDistancePoint " + minDistancePoint);

  }

  public static double minDistance(Point[] points, int size) {
    double minDistance = points[0].distance(0, 0);
    for (int i = 0; i < size; i++) {
      if (points[i].distance(0, 0) < minDistance) {
        minDistance = points[i].distance(0, 0);
      }
    }
    return minDistance;
  }

  public static Point minDistancePoint(Point[] points, int size) {
    double minDistance = points[0].distance(0, 0);
    Point minDistancePoint = points[0];
    for (int i = 0; i < size; i++) {
      if (points[i].distance(0, 0) < minDistance) {
        minDistance = points[i].distance(0, 0);
        minDistancePoint = points[i];
      }
    }
    return minDistancePoint;
  }

}
