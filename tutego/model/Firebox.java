package tutego.model;

/**
 * Feuermelder
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Firebox extends ElectronicDevice {

  public Firebox() {
    on();
  }

  @Override
  public void off() {

  }

  @Override
  public String toString() {
    return "Feuermelder [ist an]";
  }

}
