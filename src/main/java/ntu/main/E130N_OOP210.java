package ntu.main;

import ntu.model.MyPoint;
import ntu.model.MyRectangle;

/**
 * Aufgabe OOP 2.10
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E130N_OOP210 {

   public static void main(String[] args) {

      MyPoint point1 = new MyPoint(8, 6);
      MyPoint point2 = new MyPoint(0, 4);
      MyRectangle rectangle = new MyRectangle(point1, point2);

      System.out.println("Perimeter: " + rectangle.getPerimeter());
      System.out.println("Area: " + rectangle.getArea());

   }

}
