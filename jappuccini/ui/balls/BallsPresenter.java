package jappuccini.ui.balls;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BallsPresenter {

  public class BallsCanvasMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
      Random random = new Random();
      int r = random.nextInt(100);
      int x = e.getX();
      int y = e.getY();
      int red = random.nextInt(256);
      int green = random.nextInt(256);
      int blue = random.nextInt(256);
      int speedX = random.nextInt(25);
      int speedY = random.nextInt(25);
      Color color = new Color(red, green, blue);
      balls.add(new Ball(r, x, y, color, speedX, speedY));
    }

    @Override
    public void mouseReleased(MouseEvent e) {}
  }

  private List<Ball> balls;

  public BallsPresenter(BallsView view) {
    balls = new ArrayList<>();
    view.getCanvas().setBalls(balls);
    view.getCanvas().addMouseListener(new BallsCanvasMouseListener());

    new Thread() {
      @Override
      public void run() {
        while (true) {
          for (Ball ball : balls) {
            ball.move(0, 0, view.getCanvas().getWidth(), view.getCanvas().getHeight());
          }
          view.getCanvas().repaint();
          try {
            Thread.sleep(25);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }.start();
  }

}
