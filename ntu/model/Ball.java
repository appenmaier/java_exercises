package ntu.model;

/**
 * Ball
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Ball {

  private int radius;
  private float x;
  private float xDelta;
  private float y;
  private float yDelta;

  public Ball(float x, float y, int radius, float xDelta, float yDelta) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.xDelta = xDelta;
    this.yDelta = yDelta;
  }

  public int getRadius() {
    return radius;
  }

  public float getX() {
    return x;
  }

  public float getXDelta() {
    return xDelta;
  }

  public float getY() {
    return y;
  }

  public float getYDelta() {
    return yDelta;
  }

  public void move() {
    x += xDelta;
    y += yDelta;
  }

  public void reflectHorizontal() {
    xDelta *= -1;
  }

  public void reflectVertical() {
    yDelta *= -1;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public void setX(float x) {
    this.x = x;
  }

  public void setXDelta(float xDelta) {
    this.xDelta = xDelta;
  }

  public void setY(float y) {
    this.y = y;
  }

  public void setYDelta(float yDelta) {
    this.yDelta = yDelta;
  }

  @Override
  public String toString() {
    return "Ball [(" + x + ", " + y + "), speed=(" + xDelta + ", " + yDelta + ")]";
  }

}
