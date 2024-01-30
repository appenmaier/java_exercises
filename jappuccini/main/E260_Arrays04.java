package jappuccini.main;

/**
 * Arrays04
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E260_Arrays04 {

  public static void main(String[] args) {

    int[] binaryNumber1 = {1, 0, 0, 1, 0, 1, 1, 0};
    int[] binaryNumber2 = {0, 1, 1, 0, 0, 1, 0, 1};
    int[] binaryNumber3 = new int[8];

    int carry = 0;

    for (int i = binaryNumber1.length - 1; i >= 0; i--) {
      int subTotal = binaryNumber1[i] + binaryNumber2[i] + carry;

      if (subTotal == 0 || subTotal == 1) {
        binaryNumber3[i] = subTotal;
        carry = 0;
      } else if (subTotal == 2) {
        binaryNumber3[i] = 0;
        carry = 1;
      } else {
        binaryNumber3[i] = 1;
        carry = 1;
      }
    }

    if (carry == 1) {
      System.err.println("Ueberlauf");
      return;
    }

    System.out.print("  ");
    for (int i = 0; i < binaryNumber1.length; i++) {
      System.out.print(binaryNumber1[i]);
    }
    System.out.println();

    System.out.print("+ ");
    for (int i = 0; i < binaryNumber2.length; i++) {
      System.out.print(binaryNumber2[i]);
    }
    System.out.println();

    System.out.print("= ");
    for (int i = 0; i < binaryNumber3.length; i++) {
      System.out.print(binaryNumber3[i]);
    }

  }

}
