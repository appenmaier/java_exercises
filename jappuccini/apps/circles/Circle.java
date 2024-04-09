package jappuccini.apps.circles;

import javafx.scene.paint.Color;

public class Circle {

  private Color color;
  private int r;
  private int x;
  private int y;

  public Circle(int r, int x, int y, Color color) {
    this.r = r;
    this.x = x;
    this.y = y;
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public int getR() {
    return r;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "Circle [Color=" + color + ", r=" + r + ", x=" + x + ", y=" + y + "]";
  }

}
