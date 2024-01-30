package jappuccini.model;

/**
 * Kartenwert (Skat)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public enum SkatCardValue {

  SEVEN("7", 0), EIGHT("8", 0), NINE("9", 0), TEN("10", 10), JACK("Bube", 2), CHECKERS("Dame",
      3), KING("Koenig", 4), ACE("Ass", 11);

  private String description;
  private int value;

  private SkatCardValue(String description, int value) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public int getValue() {
    return value;
  }

}
