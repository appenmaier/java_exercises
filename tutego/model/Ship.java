package tutego.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Schiff
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 * 
 */
public class Ship {

  public final static int MAXIMUM_POWER_CONSUMPTION = 100;

  private ArrayList<ElectronicDevice> electronicDevices;

  public Ship() {
    electronicDevices = new ArrayList<>();
  }

  public void addAllElectronicDevices(ElectronicDevice... electronicDevices) {
    for (ElectronicDevice e : electronicDevices) {
      addElectronicDevice(e);
    }
  }

  public void addAndCheckAllElectronicDevices(ElectronicDevice... electronicDevices) {
    for (ElectronicDevice e : electronicDevices) {
      addAndCheckElectronicDevice(e);
    }
  }

  public void addAndCheckElectronicDevice(ElectronicDevice electronicDevice) {
    if (electronicDevice instanceof Radio) {
      Radio radio = (Radio) electronicDevice;
      if (radio.getVolume() == 0) {
        return;
      }
    }

    addElectronicDevice(electronicDevice);
    System.out.println("GEZ-Gebuehren nicht vergessen");
  }

  public void addElectronicDevice(ElectronicDevice electronicDevice) {
    electronicDevices.add(electronicDevice);
    Collections.sort(electronicDevices, new ElectronicDeviceWattComparator());
  }

  public ElectronicDevice findMostPowerConsumingElectronicDevice() {
    return Collections.max(electronicDevices, new ElectronicDeviceWattComparator());
  }

  public void holiday() {
    for (ElectronicDevice e : electronicDevices) {
      e.off();
    }
  }

  public int numberOfElectronicDevicesSwitchedOn() {
    int count = 0;

    for (ElectronicDevice e : electronicDevices) {
      if (e.isOn()) {
        count++;
      }
    }

    return count;
  }

  public void removePowerConsumingElectronicDevices() {
    MaximumPowerConsumptionOfElectronicDevicePredicate predicate =
        new MaximumPowerConsumptionOfElectronicDevicePredicate(MAXIMUM_POWER_CONSUMPTION);

    electronicDevices.removeIf(predicate);
  }

  @Override
  public String toString() {
    String text = "";
    for (ElectronicDevice e : electronicDevices) {
      text += e.toString() + "\n";
    }
    text += "Anzahl eingeschalteter Geraete: " + numberOfElectronicDevicesSwitchedOn() + "\n";
    return text;
  }

}
