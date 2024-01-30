package tutego.model;

/**
 * Rechner
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Calculator {

  public static boolean isRightTriangle(double x, double y, double z, double tolerancy) {
    double a, b, c;

    if (x > y && x > z) {
      a = y;
      b = z;
      c = x;
    } else if (y > x && y > z) {
      a = x;
      b = z;
      c = y;
    } else {
      a = x;
      b = y;
      c = z;
    }

    double c2 = c * c;
    double a2b2 = a * a + b * b;
    if (Math.abs(c2 - a2b2) < tolerancy) {
      return true;
    } else {
      return false;
    }
  }

}
