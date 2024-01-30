package jappuccini.model;

/**
 * Karte (Skat)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class SkatCard {

  private SkatCardColor color;
  private SkatCardValue value;

  public SkatCard(SkatCardColor color, SkatCardValue value) {
    this.color = color;
    this.value = value;
  }

  public String getCardDescription() {
    return color.getDescription() + " " + value.getDescription();
  }

  public SkatCardColor getColor() {
    return color;
  }

  public SkatCardValue getValue() {
    return value;
  }

}
