package jappuccini.main;

/**
 * Arrays01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E230_Arrays01 {

  public static void main(String[] args) {

    int[] powerOfTwo = new int[16];

    for (int i = 0; i < powerOfTwo.length; i++) {
      powerOfTwo[i] = (int) Math.pow(2, i);
    }

    /* Ausgabe */
    System.out.println("Zweierpotenzen: ");
    for (int i = 0; i < powerOfTwo.length; i++) {
      System.out.println(powerOfTwo[i]);
    }

  }

}
