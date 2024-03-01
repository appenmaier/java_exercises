package ntu.model;

/**
 * Kreis
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MyCircle {

  private MyPoint center;
  private int radius;

  public MyCircle() {
    center = new MyPoint();
    radius = 1;
  }

  public MyCircle(int x, int y, int radius) {
    center = new MyPoint(x, y);
    this.radius = radius;
  }

  public MyCircle(MyPoint center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  public double distance(MyCircle another) {
    return center.distance(another.center);
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public MyPoint getCenter() {
    return center;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setCenter(MyPoint center) {
    this.center = center;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "MyCircle [center=" + center + ", radius=" + radius + "]";
  }

}
