package ntu.main;

import ntu.model.MyPoint;
import ntu.model.MyTriangle;

/**
 * Aufgabe OOP 2.9
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E130N_OOP29 {

   public static void main(String[] args) {

      MyPoint point1 = new MyPoint(8, 6);
      MyPoint point2 = new MyPoint(0, 4);
      MyPoint point3 = new MyPoint(8, 2);
      MyTriangle triangle = new MyTriangle(point1, point2, point3);

      System.out.println("Perimeter: " + triangle.getPerimeter());
      System.out.println("Type: " + triangle.getType());

   }

}
