package jappuccini.model;

/**
 * Kreatur
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class Creature {

  private String name;
  private int attackValue;
  private int hitpoints;

  public Creature(String name, int attackValue, int hitpoints) {
    this.name = name;
    this.attackValue = attackValue;
    this.hitpoints = hitpoints;
  }

  public boolean attackCreature(Creature creature) {
    System.out.println(this.name + " greift " + creature.name + " an und erzielt "
        + this.attackValue + " Schaden");
    if (this.attackValue >= creature.hitpoints) {
      creature.hitpoints = 0;
      System.out.println(creature.name + " wurde vernichtet");
      return true;
    } else {
      creature.hitpoints -= this.attackValue;
      System.out.println(creature.name + " hat noch " + creature.hitpoints + " Lebenspunkte");
      return false;
    }
  }
  /*
   * version 1.0: public void attackCreature(Creature creature) { System.out.println(this.name +
   * " greift " + creature.name + " an und erzielt " + this.attackValue + " Schaden");
   * creature.hitpoints -= this.attackValue; }
   */

  public int getAttackValue() {
    return attackValue;
  }

  public int getHitpoints() {
    return hitpoints;
  }

  public String getName() {
    return name;
  }

  public void print() {
    System.out.print(name + " (" + attackValue + " - " + hitpoints + ")");
  }
  /* version 1.0: - */

  public void setHitpoints(int hitpoints) {
    this.hitpoints = hitpoints;
  }
  /* version 1.0: - */

}
