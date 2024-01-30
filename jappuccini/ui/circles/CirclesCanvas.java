package jappuccini.ui.circles;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CirclesCanvas extends JPanel {

  private List<Circle> circles;

  public CirclesCanvas() {
    setBackground(Color.WHITE);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Circle c : circles) {
      g.setColor(c.getColor());
      g.fillOval(c.getX(), c.getY(), c.getR() * 2, c.getR() * 2);
    }
  }

  public void setCircles(List<Circle> circles) {
    this.circles = circles;
  }

}
