package jappuccini.model;

import java.util.Optional;

/**
 * Getraenkekiste
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class Crate<T extends Bottle> {

  private T box1;
  /* version 1.0: private Object box1; */
  private T box2;
  /* version 1.0: private Object box2; */
  private T box3;
  /* version 1.0: private Object box3; */
  private T box4;
  /* version 1.0: private Object box4; */
  private T box5;
  /* version 1.0: private Object box5; */
  private T box6;
  /* version 1.0: private Object box6; */

  public void insertBottle(T bottle, int box) {
    switch (box) {
      case 1 -> box1 = bottle;
      case 2 -> box2 = bottle;
      case 3 -> box3 = bottle;
      case 4 -> box4 = bottle;
      case 5 -> box5 = bottle;
      case 6 -> box6 = bottle;
    }
  }
  /*
   * version 1.0: public void insertBottle(Object bottle, int box) { switch (box) { case 1 -> box1 =
   * bottle; case 2 -> box2 = bottle; case 3 -> box3 = bottle; case 4 -> box4 = bottle; case 5 ->
   * box5 = bottle; case 6 -> box6 = bottle; } }
   */

  public Optional<T> takeBottle(int box) {
    return switch (box) {
      case 1 -> Optional.of(box1);
      case 2 -> Optional.of(box2);
      case 3 -> Optional.of(box3);
      case 4 -> Optional.of(box4);
      case 5 -> Optional.of(box5);
      case 6 -> Optional.of(box6);
      default -> Optional.empty();
    };
  }
  /*
   * version 2.0: public T takeBottle(int box) { return switch (box) { case 1 -> box1; case 2 ->
   * box2; case 3 -> box3; case 4 -> box4; case 5 -> box5; case 6 -> box6; default -> null; }; }
   */
  /*
   * version 1.0: public Object takeBottle(int box) { return switch (box) { case 1 -> box1; case 2
   * -> box2; case 3 -> box3; case 4 -> box4; case 5 -> box5; case 6 -> box6; default -> null; }; }
   */

}
/* version 1.0: public class Crate {...} */
