package ntu.model;

/**
 * Punkt
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MyPoint {

  private int x;
  private int y;

  public MyPoint() {}

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double distance() {
    return Math.hypot(x, y);
  }

  public double distance(int x, int y) {
    double adjacent = this.x - x;
    double opposite = this.y - y;
    return Math.hypot(adjacent, opposite);
  }

  public double distance(MyPoint another) {
    double adjacent = x - another.x;
    double opposite = y - another.y;
    return Math.hypot(adjacent, opposite);
  }

  public int getX() {
    return x;
  }

  public int[] getXY() {
    return new int[] {x, y};
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

}
