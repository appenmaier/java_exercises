package tutego.main;

import tutego.model.Calculator;

/**
 * Aufgabe Imperativ-1.6.3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E260T_I2_163 {

  public static void main(String[] args) {

    System.out.println(Calculator.isRightTriangle(3, 4, 5, 0.1));
    System.out.println(Calculator.isRightTriangle(5, 3, 4, 0.1));
    System.out.println(Calculator.isRightTriangle(5, 12, 13, 0.1));
    System.out.println(Calculator.isRightTriangle(1, 2, 3, 0.1));
    System.out.println(Calculator.isRightTriangle(1, 1, Math.sqrt(2), 0.1));

  }

}
