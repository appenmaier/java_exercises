package jappuccini.main;

/**
 * Cases05
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E130_Cases05 {

  public static void main(String[] args) {

    int a = 5;
    int b = 5;
    boolean c = true;
    boolean d = true;
    boolean e;
    int f = 5;
    int g = 3;
    int h = 2;
    int i = 4;
    int j = 0;

    e = c && (a > 2 ? (b == (a = a * 2)) : d);
    j += ((h < ((f - g == 3) ? 3 : 2)) && (i < 5)) ? 1 : 2;

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
    System.out.println("d: " + d);
    System.out.println("e: " + e);
    System.out.println("f: " + f);
    System.out.println("g: " + g);
    System.out.println("h: " + h);
    System.out.println("i: " + i);
    System.out.println("j: " + j);

  }

}
