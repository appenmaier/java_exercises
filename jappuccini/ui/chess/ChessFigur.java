package jappuccini.ui.chess;

import java.awt.Color;
import javax.swing.ImageIcon;

public class ChessFigur {

  private Color color;
  private ImageIcon icon;
  private ChessFigurType type;

  ChessFigur(ChessFigurType type, Color color, ImageIcon icon) {
    this.type = type;
    this.color = color;
    this.icon = icon;
  }

  public Color getColor() {
    return color;
  }

  public ImageIcon getIcon() {
    return icon;
  }

  public ChessFigurType getType() {
    return type;
  }

}
