package jappuccini.model;

import java.util.Comparator;

/**
 * CoordinateComparator
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CoordinateComparator implements Comparator<Coordinate> {

  @Override
  public int compare(Coordinate o1, Coordinate o2) {
    return Double.valueOf(o2.getDistanceToOriginPoint()).compareTo(o1.getDistanceToOriginPoint());
  }

}
