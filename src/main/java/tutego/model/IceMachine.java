package tutego.model;

/**
 * Eismaschine
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class IceMachine extends ElectronicDevice {

   @Override
   public String toString() {
      return "Eismaschine [" + (isOn() ? "ist an]" : "ist aus]");
   }

}
