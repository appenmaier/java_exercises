package jappuccini.model;

import java.util.Comparator;

/**
 * CoordinateByDistanceToOriginComparator
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CoordinateByDistanceToOriginPointComparator implements Comparator<Coordinate> {

  @Override
  public int compare(Coordinate coordinate1, Coordinate coordinate2) {
    return Double.compare(coordinate2.getDistanceToOriginPoint(),
        coordinate1.getDistanceToOriginPoint());
  }

}
