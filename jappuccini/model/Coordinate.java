package jappuccini.model;

/**
 * Koordinate
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Coordinate implements Comparable<Coordinate> {

  private int x;
  private int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int compareTo(Coordinate o) {
    return Double.valueOf(this.getDistanceToOriginPoint()).compareTo(o.getDistanceToOriginPoint());
  }

  public double getDistanceToOriginPoint() {
    return Math.hypot(x, y);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "Coordinate [x=" + x + ", y=" + y + ", getDistanceToOriginPoint()="
        + getDistanceToOriginPoint() + "]";
  }

}
