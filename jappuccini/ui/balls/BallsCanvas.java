package jappuccini.ui.balls;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BallsCanvas extends JPanel {

  private List<Ball> balls;

  public BallsCanvas() {
    setBackground(Color.WHITE);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Ball ball : balls) {
      g.setColor(ball.getColor());
      g.fillOval(ball.getX(), ball.getY(), ball.getR() * 2, ball.getR() * 2);
    }
  }

  public void setBalls(List<Ball> balls) {
    this.balls = balls;
  }

}
