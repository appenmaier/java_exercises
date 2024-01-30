package jappuccini.main;

/**
 * DataObjects02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E030_DataObjects02 {

  public static void main(String[] args) {

    int a = 101;
    int b = 0b101;
    int c = 0x101;
    int d = 0xAFFE;
    int e = 128;
    byte f = (byte) e;
    double g = 9.87654321;
    int h = (int) g;

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
    System.out.println("d: " + d);
    System.out.println("f: " + f);
    System.out.println("h: " + h);

  }

}
