package jappuccini.main;

import jappuccini.model.Barrel;
import jappuccini.model.BarrelOverflowException;

/**
 * Exceptions02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E560_Exceptions02 {

  public static void main(String[] args) {

    Barrel barrel = new Barrel(100);

    try {
      barrel.addFluid(50);
      System.out.println(barrel);
      barrel.addFluid(51);
      System.out.println(barrel);
      barrel.addFluid(2);
      System.out.println(barrel);
    } catch (BarrelOverflowException e) {
      System.err.println(e.getMessage());
    }

  }

}
