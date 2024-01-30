package jappuccini.ui.circles;

import java.awt.Color;

public class Circle {

  private Color Color;
  private int r;
  private int x;
  private int y;

  public Circle(int r, int x, int y, Color color) {
    this.r = r;
    this.x = x;
    this.y = y;
    Color = color;
  }

  public Color getColor() {
    return Color;
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
    return "Circle [Color=" + Color + ", r=" + r + ", x=" + x + ", y=" + y + "]";
  }

}
