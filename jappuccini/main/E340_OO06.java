package jappuccini.main;

import jappuccini.model.Creature;

/**
 * OO06
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E340_OO06 {

  public static void main(String[] args) {

    Creature zombie = new Creature("Zombie", 2, 10);
    Creature vampire = new Creature("Vampir", 4, 6);

    zombie.attackCreature(vampire);
    vampire.attackCreature(zombie);
    zombie.attackCreature(vampire);
    vampire.attackCreature(zombie);

  }

}
