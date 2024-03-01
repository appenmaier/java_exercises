package ntu.main;

import ntu.model.Rectangle;

/**
 * Aufgabe OOP 1.3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E030N_OOP13 {

  public static void main(String[] args) {

    Rectangle r1 = new Rectangle(1.2f, 3.4f);
    System.out.println(r1);
    Rectangle r2 = new Rectangle();
    System.out.println(r2);

    r1.setLength(5.6f);
    r1.setWidth(7.8f);
    System.out.println(r1);
    System.out.println("length is: " + r1.getLength());
    System.out.println("width is: " + r1.getWidth());

    System.out.printf("area is: %.2f%n", r1.getArea());
    System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());

  }

}
