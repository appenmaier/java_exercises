package tutego.model;

import java.util.Objects;

/**
 * Toaster
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Toaster {

  private int capacity;
  private boolean stainless;
  private boolean extraLarge;

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Toaster)) {
      return false;
    }
    Toaster toaster = (Toaster) object;

    return capacity == toaster.capacity && stainless == toaster.stainless
        && extraLarge == toaster.extraLarge;
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, stainless, extraLarge);
  }

}
