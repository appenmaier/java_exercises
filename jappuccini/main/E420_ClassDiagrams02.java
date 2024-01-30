package jappuccini.main;

import java.util.ArrayList;
import jappuccini.model.DiceGame;
import jappuccini.model.Player;

/**
 * ClassDiagrams02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E420_ClassDiagrams02 {

  public static void main(String[] args) {

    ArrayList<Player> players = new ArrayList<>();

    players.add(new Player("Hans"));
    players.add(new Player("Lisa"));
    players.add(new Player("Peter"));
    DiceGame diceGame = new DiceGame(players);

    diceGame.start();

  }

}
