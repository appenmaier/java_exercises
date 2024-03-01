package ntu.model;

/**
 * Rechteck
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Rectangle {

  private float length;
  private float width;

  public Rectangle() {
    length = 1.0f;
    width = 1.0f;
  }

  public Rectangle(float length, float width) {
    super();
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }

  public float getLength() {
    return length;
  }

  public double getPerimeter() {
    return 2 * length + 2 * width;
  }

  public float getWidth() {
    return width;
  }

  public void setLength(float length) {
    this.length = length;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "Rectangle [length=" + length + ", width=" + width + "]";
  }

}
