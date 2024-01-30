package jappuccini.ui.chess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JToggleButton;

public class ChessPresenter {

  public class FieldActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      JToggleButton field = (JToggleButton) e.getSource();

      boolean fieldIsEmpty = field.getIcon() == null ? true : false;
      boolean activeChessFigurIsEmpty = activeChessFigur == null ? true : false;

      if (fieldIsEmpty && activeChessFigurIsEmpty) {
        field.setSelected(false);
        return;
      }

      if (field.equals(activeChessFigur)) {
        activeChessFigur = null;
        return;
      }

      if (!fieldIsEmpty && activeChessFigurIsEmpty) {
        activeChessFigur = field;
        return;
      }

      if (!fieldIsEmpty && !activeChessFigurIsEmpty) {
        field.setIcon(activeChessFigur.getIcon());
        field.setSelected(false);
        activeChessFigur.setIcon(null);
        activeChessFigur.setSelected(false);
        activeChessFigur = null;
        return;
      }

      field.setIcon(activeChessFigur.getIcon());
      field.setSelected(false);
      activeChessFigur.setIcon(null);
      activeChessFigur.setSelected(false);
      activeChessFigur = null;
    }
  }

  private JToggleButton activeChessFigur;

  public ChessPresenter(ChessView view) {
    Map<Integer, ChessFigur> whiteChessFigurSet = ChessFigurFactory.createChessFigurSet(true);
    for (int i = 0; i < 16; i++) {
      view.getFields().get(i).setIcon(whiteChessFigurSet.get(i).getIcon());
    }

    Map<Integer, ChessFigur> blackChessFigurSet = ChessFigurFactory.createChessFigurSet(false);
    for (int i = 63; i >= 48; i--) {
      view.getFields().get(i).setIcon(blackChessFigurSet.get(63 - i).getIcon());
    }

    FieldActionListener listener = new FieldActionListener();
    for (JToggleButton field : view.getFields()) {
      field.addActionListener(listener);
    }
  }

}
