package ntu.main;

import ntu.model.MyLine;
import ntu.model.MyPoint;

/**
 * Aufgabe OOP 2.7
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E130N_OOP27 {

  public static void main(String[] args) {

    MyPoint point1 = new MyPoint(8, 6);
    MyPoint point2 = new MyPoint(0, 4);
    MyLine line = new MyLine(point1, point2);

    System.out.println("Line: " + line);
    System.out.println("Length: " + line.getLength());
    System.out.println("Gradient: " + line.getGradient());

  }

}
