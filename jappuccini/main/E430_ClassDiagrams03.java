package jappuccini.main;

import jappuccini.model.Creature;
import jappuccini.model.CreatureGame;

/**
 * ClassDiagrams03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E430_ClassDiagrams03 {

  public static void main(String[] args) {

    Creature zombie = new Creature("Zombie", 2, 10);
    Creature vampire = new Creature("Vampir", 4, 6);

    CreatureGame creatureGame = new CreatureGame(zombie, vampire);
    creatureGame.simulateFight();

  }

}
