package jappuccini.main;

/**
 * JavaAPI01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E360_JavaAPI01 {

  public static void main(String[] args) {

    for (double x = 0; x < 1; x += 0.1) {
      System.out.printf("x = %.1f, sin(x) = %.1f%n", x, Math.sin(x));
    }

  }

}
