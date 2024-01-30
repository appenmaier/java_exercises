package jappuccini.ui.chess;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class ChessView extends JFrame {

  private List<JToggleButton> fields;

  public ChessView() {
    fields = new ArrayList<>();

    /* Set View Attributes */
    setLayout(new GridLayout(8, 8));
    setTitle("Schach");
    setSize(500, 500);
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    /* Initialize Components and Set Layout */
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        JToggleButton field = new JToggleButton();
        field.setToolTipText(i + "-" + j);
        if (i % 2 == 0) {
          if (j % 2 != 0) {
            field.setBackground(Color.GRAY);
          } else {
            field.setBackground(Color.WHITE);
          }
        } else {
          if (j % 2 == 0) {
            field.setBackground(Color.GRAY);
          } else {
            field.setBackground(Color.WHITE);
          }
        }
        fields.add(field);
        add(field);
      }
    }
  }

  public List<JToggleButton> getFields() {
    return fields;
  }

}
