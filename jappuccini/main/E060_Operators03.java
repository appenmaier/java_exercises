package jappuccini.main;

/**
 * Operators03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E060_Operators03 {

  public static void main(String[] args) {

    byte a = 116;
    byte b = 59;
    byte c, d, e, f;

    c = (byte) (a & b);
    d = (byte) (a | b);
    e = (byte) (a ^ b);
    f = (byte) (~a);

    System.out.println("c: " + c);
    System.out.println("d: " + d);
    System.out.println("e: " + e);
    System.out.println("f: " + f);

  }

}
