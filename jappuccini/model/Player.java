package jappuccini.model;

/**
 * Spieler
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class Player {

  private String name;
  private int score;
  private boolean isActive;
  /* version 1.0: - */
  private boolean specialAvailable;
  /* version 1.0: - */

  public Player(String name) {
    this.name = name;
    isActive = true;
    specialAvailable = true;
  }
  /*
   * version 1.0: public Player(String name) { this.name = name; }
   */

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public boolean getSpecialAvailable() {
    return specialAvailable;
  }
  /* version 1.0: - */

  public boolean isActiv() {
    return isActive;
  }
  /* version 1.0: - */

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }
  /* version 1.0: - */

  public void setScore(int score) {
    this.score = score;
  }

  public void setSpecialAvailable(boolean specialAvailable) {
    this.specialAvailable = specialAvailable;
  }
  /* version 1.0: - */

}
