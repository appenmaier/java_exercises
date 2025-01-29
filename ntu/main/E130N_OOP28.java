package ntu.main;

import ntu.model.MyCircle;
import ntu.model.MyPoint;

/**
 * Aufgabe OOP 2.8
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E130N_OOP28 {

   public static void main(String[] args) {

      MyPoint point1 = new MyPoint(8, 6);
      MyPoint point2 = new MyPoint(0, 4);
      MyCircle circle1 = new MyCircle(point1, 4);
      MyCircle circle2 = new MyCircle(point2, 3);

      System.out.println("Distance: " + circle1.distance(circle2));

   }

}
