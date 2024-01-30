package tutego.model;

import java.util.function.Predicate;

/**
 * MaximumPowerConsumptionOfElectronicDevicePredicate
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MaximumPowerConsumptionOfElectronicDevicePredicate
    implements Predicate<ElectronicDevice> {

  public int maximumPowerConsumption;

  public MaximumPowerConsumptionOfElectronicDevicePredicate(int maximumPowerConsumption) {
    this.maximumPowerConsumption = maximumPowerConsumption;
  }

  @Override
  public boolean test(ElectronicDevice e) {
    if (e.getWatt() > maximumPowerConsumption) {
      return true;
    } else {
      return false;
    }
  }

}
