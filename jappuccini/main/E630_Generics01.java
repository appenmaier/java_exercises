package jappuccini.main;

import jappuccini.model.BeerBottle;
import jappuccini.model.Crate;
import jappuccini.model.WineBottle;

/**
 * Generics01
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class E630_Generics01 {

  @SuppressWarnings({"rawtypes", "unchecked"})
  public static void main(String[] args) {

    Crate crate = new Crate();
    crate.insertBottle(new BeerBottle(), 3);
    crate.insertBottle(new BeerBottle(), 4);
    crate.insertBottle(new WineBottle(), 5);
    crate.insertBottle(new WineBottle(), 2);

    /*
     * version 1.0: if (crate.takeBottle(3) instanceof BeerBottle) { BeerBottle beerBottle =
     * (BeerBottle) crate.takeBottle(3); beerBottle.chugALug(); }
     */

  }

}
