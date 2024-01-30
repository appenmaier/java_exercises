package tutego.model;

/**
 * Elektronisches Geraet
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class ElectronicDevice {

  public static int numberOfElectronicDevicesSwitchedOn(ElectronicDevice... electronicDevices) {
    int count = 0;

    for (ElectronicDevice e : electronicDevices) {
      if (e.isOn()) {
        count++;
      }
    }

    return count;
  }

  private boolean isOn;

  private int watt;

  public int getWatt() {
    return watt;
  }

  public boolean isOn() {
    return isOn;
  }

  public void off() {
    isOn = false;
    System.out.println("aus");
  }

  public void on() {
    isOn = true;
    System.out.println("an");
  }

  public void setWatt(int watt) throws IllegalWattException {
    if (watt <= 0) {
      throw new IllegalWattException("Ungueltige Wattzahl " + watt);
    }

    this.watt = watt;
  }

  @Override
  public String toString() {
    return "Elektronisches Geraet [Watt=" + watt + " kW" + (isOn ? ", ist an]" : ", ist aus]");
  }

}
