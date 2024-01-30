package jappuccini.main;

/**
 * Arrays02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E240_Arrays02 {

  public static void main(String[] args) {

    int[] input = {4, 8, 2, 6, 9, 1};
    int[] output = new int[input.length];

    // for (int i = 0; i < input.length; i++) {
    // output[output.length - 1 - i] = input[i];
    // }
    for (int i = input.length - 1; i >= 0; i--) {
      output[output.length - 1 - i] = input[i];
    }

    /* Ausgabe */
    System.out.print("Eingabe: ");
    for (int i = 0; i < input.length; i++) {
      System.out.print(input[i] + " ");
    }
    System.out.println();

    System.out.print("Ausgabe: ");
    for (int i = 0; i < output.length; i++) {
      System.out.print(output[i] + " ");
    }

  }

}
