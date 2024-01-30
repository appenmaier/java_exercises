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
      barrel.printFluidLevel();
      barrel.addFluid(51);
      barrel.printFluidLevel();
      barrel.addFluid(2);
      barrel.printFluidLevel();
    } catch (BarrelOverflowException e) {
      e.printStackTrace();
    }

  }

}
