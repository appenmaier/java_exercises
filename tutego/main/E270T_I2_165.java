package tutego.main;

/**
 * Aufgabe Imperativ-1.6.5 (ohne Rekursion)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E270T_I2_165 {

  public static void collatz(long n) {
    while (n != 1) {
      System.out.print(n + "->");
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = 3 * n + 1;
      }
    }
    System.out.println(1);
  }

  public static long collatzMax(long n) {
    long max = 0;
    while (n != 1) {
      if (n > max) {
        max = n;
      }
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = 3 * n + 1;
      }
    }
    return max;
  }

  public static void main(String[] args) {

    long n = 27L;

    collatz(n);
    long max = collatzMax(n);
    System.out.println("max: " + max);

  }

}
