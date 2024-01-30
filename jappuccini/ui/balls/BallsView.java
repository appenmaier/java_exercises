package jappuccini.ui.balls;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BallsView extends JFrame {

  private BallsCanvas canvas;

  public BallsView() {
    /* Set View Attributes */
    setTitle("Baelle");
    setSize(750, 750);
    setLocationRelativeTo(null);
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    /* Initialize Components */
    canvas = new BallsCanvas();

    /* Set Layout */
    add(canvas);
  }

  public BallsCanvas getCanvas() {
    return canvas;
  }

}
