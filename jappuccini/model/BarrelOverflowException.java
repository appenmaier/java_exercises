package jappuccini.model;

/**
 * BarrelOverflowException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BarrelOverflowException extends Exception {

   private static final long serialVersionUID = 1L;

   public BarrelOverflowException() {
      super("Das war der Tropfen, der das Fass zum Ueberlaufen gebracht hat");
   }

}
