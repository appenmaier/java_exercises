package jappuccini.main;

import java.util.ArrayList;
import jappuccini.model.SkatCard;
import jappuccini.model.SkatCardDeck;

/**
 * ClassDiagrams05
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E450_ClassDiagrams05 {

  public static void main(String[] args) {

    SkatCardDeck skatCardDeck = new SkatCardDeck();
    skatCardDeck.shuffleSkatCards();
    ArrayList<SkatCard> skatCards = skatCardDeck.getSkatCards();
    for (SkatCard skatCard : skatCards) {
      System.out.println(skatCard.getCardDescription());
    }

  }

}
