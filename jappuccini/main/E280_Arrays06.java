package jappuccini.main;

/**
 * Arrays06
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E280_Arrays06 {

  public static void main(String[] args) {

    int[][] input = {{5, 8, 2}, {9, 6, 10}, {10, 2, 7}, {1, 9, 5}};
    int[][] output = new int[input.length][2];

    for (int i = 0; i < input.length; i++) {
      int min = input[i][0];
      int max = input[i][0];
      for (int j = 0; j < input[i].length; j++) {
        max = (input[i][j] > max) ? input[i][j] : max;
        min = (input[i][j] < min) ? input[i][j] : min;
      }
      output[i][0] = min;
      output[i][1] = max;
    }

    System.out.println("MIN - MAX");
    for (int i = 0; i < output.length; i++) {
      System.out.println(output[i][0] + " - " + output[i][1]);
    }

  }

}
