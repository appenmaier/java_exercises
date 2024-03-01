package ntu.model;

/**
 * Linie
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MyLine {

  private MyPoint begin;
  private MyPoint end;

  public MyLine(MyPoint begin, MyPoint end) {
    this.begin = begin;
    this.end = end;
  }

  public MyPoint getBegin() {
    return begin;
  }

  public MyPoint getEnd() {
    return end;
  }

  public double getGradient() {
    return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
  }

  public double getLength() {
    return begin.distance(end);
  }

  public void setBegin(MyPoint begin) {
    this.begin = begin;
  }

  public void setEnd(MyPoint end) {
    this.end = end;
  }

  @Override
  public String toString() {
    return "MyLine [begin=" + begin + ", end=" + end + "]";
  }

}
