package jappuccini.ui.dice;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DiceView extends JFrame {

  private JPanel buttons;
  private DiceCanvas canvas;
  private JButton rollTheDice;

  public DiceView() {
    /* Set View Attributes */
    setTitle("Wuerfel");
    setSize(250, 250);
    setLocationRelativeTo(null);
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    /* Initialize Components */
    canvas = new DiceCanvas();
    buttons = new JPanel();
    rollTheDice = new JButton("Wuerfeln");

    /* Set Layout */
    setLayout(new BorderLayout(25, 25));
    add(buttons, BorderLayout.SOUTH);
    add(canvas, BorderLayout.CENTER);
    buttons.add(rollTheDice);
  }

  public JPanel getButtons() {
    return buttons;
  }

  public DiceCanvas getCanvas() {
    return canvas;
  }

  public JButton getRollTheDice() {
    return rollTheDice;
  }

}
