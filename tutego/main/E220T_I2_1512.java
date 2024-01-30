package tutego.main;

/**
 * Aufgabe Imperativ-1.5.12
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E220T_I2_1512 {

  public static void main(String[] args) {

    int counter = 0;

    System.out.println("x - o - l - t");
    System.out.println("-------------");
    for (int x = 0; x <= 9; x++) {
      for (int o = 0; o <= 9; o++) {
        for (int l = 0; l <= 9; l++) {
          for (int t = 0; t <= 9; t++) {
            if (l + x == t && o + x == l && x + l == t) {
              counter++;
              if (x != o && x != l && x != t && o != l && o != t && l != t) {
                System.out.println(x + " - " + o + " - " + l + " - " + t + " !");
              } else {
                System.out.println(x + " - " + o + " - " + l + " - " + t);
              }
            }
          }
        }
      }
    }
    System.out.println();
    System.out.println("counter: " + counter);

  }

}
