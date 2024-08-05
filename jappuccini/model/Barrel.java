package jappuccini.model;

/**
 * Fass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Barrel {

  private int capacity;
  private int fluidLevel;

  public Barrel(int capacity) {
    this.capacity = capacity;
  }

  public void addFluid(int value) throws BarrelOverflowException {
    if (fluidLevel + value > capacity) {
      fluidLevel = capacity;
      throw new BarrelOverflowException();
    }

    fluidLevel += value;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getFluidLevel() {
    return fluidLevel;
  }

  @Override
  public String toString() {
    return "Barrel [capacity=" + capacity + ", fluidLevel=" + fluidLevel + "]";
  }

}
