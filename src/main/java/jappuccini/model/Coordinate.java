package jappuccini.model;

import java.util.Objects;

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
   public int compareTo(Coordinate other) {
      return Double.compare(getDistanceToOriginPoint(), other.getDistanceToOriginPoint());
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Coordinate other = (Coordinate) obj;
      return x == other.x && y == other.y;
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
   public int hashCode() {
      return Objects.hash(x, y);
   }

   @Override
   public String toString() {
      return "Coordinate [x=" + x + ", y=" + y + ", getDistanceToOriginPoint()="
            + getDistanceToOriginPoint() + "]";
   }

}
