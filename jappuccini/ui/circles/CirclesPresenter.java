package jappuccini.ui.circles;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CirclesPresenter {

  public class DrawCircleActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      Random random = new Random();
      int r = random.nextInt(100);
      int x = random.nextInt((int) view.getCanvas().getBounds().getWidth());
      int y = random.nextInt((int) view.getCanvas().getBounds().getHeight());
      int red = random.nextInt(256);
      int green = random.nextInt(256);
      int blue = random.nextInt(256);
      Color color = new Color(red, green, blue);
      circles.add(new Circle(r, x, y, color));
      view.getCanvas().repaint();
    }
  }

  public class PrintCirclesActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      for (Circle c : circles) {
        System.out.println(c);
      }
    }
  }

  private List<Circle> circles;
  private CirclesView view;

  public CirclesPresenter(CirclesView view) {
    this.view = view;
    circles = new ArrayList<>();
    view.getCanvas().setCircles(circles);
    view.getDrawCircle().addActionListener(new DrawCircleActionListener());
    view.getPrintCircles().addActionListener(new PrintCirclesActionListener());
  }

}
