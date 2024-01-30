package jappuccini.main;

import java.util.ArrayList;
import jappuccini.model.DiceGame;
import jappuccini.model.Player;

/**
 * Polymorphy04
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E500_Polymorphy04 {

  public static void main(String[] args) {

    ArrayList<Player> players = new ArrayList<>();

    players.add(new Player("Hans"));
    players.add(new Player("Lisa"));
    players.add(new Player("Peter"));
    DiceGame diceGame = new DiceGame(players);

    diceGame.start();

  }

}
