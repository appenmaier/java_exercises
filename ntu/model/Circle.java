package ntu.model;

/**
 * Kreis
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class Circle {

  private String color;
  private double radius;

  public Circle() {
    radius = 1.0;
    color = "red";
  }

  public Circle(double radius) {
    this.radius = radius;
    color = "red";
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }
  /* version 1.0: - */

  public String getColor() {
    return color;
  }

  public double getRadius() {
    return radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Circle [radius=" + radius + " color=" + color + "]";
  }

}
