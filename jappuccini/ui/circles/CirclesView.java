package jappuccini.ui.circles;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CirclesView extends JFrame {

  private JPanel buttons;
  private CirclesCanvas canvas;
  private JButton drawCircle;
  private JButton printCircles;

  public CirclesView() {
    /* Set View Attributes */
    setTitle("Kreise");
    setSize(750, 750);
    setLocationRelativeTo(null);
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    /* Initialize Components */
    canvas = new CirclesCanvas();
    buttons = new JPanel();
    drawCircle = new JButton("Kreis zeichnen");
    printCircles = new JButton("Kreise ausgeben");

    /* Set Layout */
    setLayout(new BorderLayout(25, 25));
    add(buttons, BorderLayout.SOUTH);
    add(canvas, BorderLayout.CENTER);
    buttons.add(drawCircle);
    buttons.add(printCircles);
  }

  public JPanel getButtons() {
    return buttons;
  }

  public CirclesCanvas getCanvas() {
    return canvas;
  }

  public JButton getDrawCircle() {
    return drawCircle;
  }

  public JButton getPrintCircles() {
    return printCircles;
  }

}
