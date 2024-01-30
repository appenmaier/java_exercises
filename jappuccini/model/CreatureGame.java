package jappuccini.model;

/**
 * Kreaturenspiel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class CreatureGame {

  private Creature creature1;
  private Creature creature2;
  private int noRounds;

  public CreatureGame(Creature creature1, Creature creature2) {
    this.creature1 = creature1;
    this.creature2 = creature2;
  }

  private boolean move(Creature creature1, Creature creature2) {
    return creature1.attackCreature(creature2);
  }

  private void print() {
    System.out.print("Runde " + noRounds + ": ");
    creature1.print();
    System.out.print(", ");
    creature2.print();
    System.out.println();
  }

  public void simulateFight() {
    noRounds = 1;
    while (true) {
      print();
      if (move(creature1, creature2)) {
        break;
      }
      if (move(creature2, creature1)) {
        break;
      }
      System.out.println();
      noRounds++;
    }
  }

}
