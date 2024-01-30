package jappuccini.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Kartendeck (Skat)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class SkatCardDeck {

  private ArrayList<SkatCard> skatCards;

  public SkatCardDeck() {
    skatCards = new ArrayList<>();
    for (SkatCardColor color : SkatCardColor.values()) {
      for (SkatCardValue value : SkatCardValue.values()) {
        skatCards.add(new SkatCard(color, value));
      }
    }
  }

  public ArrayList<SkatCard> getSkatCards() {
    return skatCards;
  }

  public void shuffleSkatCards() {
    Random random = new Random();
    for (int i = 0; i < 1000000; i++) {
      Integer index = random.nextInt(skatCards.size());
      SkatCard skatCard = skatCards.get(index);
      skatCards.remove(skatCard);
      skatCards.add(skatCard);
    }
  }

}
