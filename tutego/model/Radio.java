package tutego.model;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 12.0
 * 
 */
public class Radio extends ElectronicDevice {

  /**
   * Modulation
   * 
   * @author Daniel Appenmaier
   * @version 1.0
   */
  public enum Modulation {

    AM, FM

  }

  public static double senderToFrequency(String sender) {
    switch (sender) {
      case "DASDING":
        return 107.2;
      default:
        return 0;
    }
  }

  private int volume;
  private double frequency;
  private Modulation modulation;

  @SuppressWarnings("unused")
  private double minFrequency;

  @SuppressWarnings("unused")
  private double maxFrequency;

  public Radio() {}

  public Radio(double frequency) {
    this.frequency = frequency;
  }

  public Radio(Radio r) {
    if (r.isOn()) {
      on();
    }
    volume = r.getVolume();
    frequency = r.getFrequency();
    modulation = r.getModulation();
  }

  public Radio(String sender) {
    frequency = Radio.senderToFrequency(sender);
  }

  public double getFrequency() {
    return frequency;
  }

  public Modulation getModulation() {
    return modulation;
  }

  public int getVolume() {
    return volume;
  }

  public void setFrequency(double frequency) {
    this.frequency = frequency;
  }

  public void setModulation(Modulation modulation) {
    this.modulation = modulation;
    if (modulation.equals(Modulation.AM)) {
      minFrequency = 0.1485;
      maxFrequency = 26.1;
    } else {
      minFrequency = 87.5;
      maxFrequency = 108;
    }
  }

  @Override
  public String toString() {
    return "Radio [Lautstaerke=" + volume + ", Frequenz=" + frequency + " MHz"
        + (modulation == null ? "" : ", Modulation=" + modulation.toString()) + ", Leistung="
        + getWatt() + " W" + (isOn() ? ", ist an]" : ", ist aus]");
  }

  public void volumeDown() {
    volume--;
  }

  public void volumeUp() {
    volume++;
  }

}
