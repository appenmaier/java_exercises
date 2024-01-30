package jappuccini.ui.dice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DicePresenter {

  public class RollTheDiceActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      dice.rollTheDice();
      // System.out.println(dice.getValue());
      view.getCanvas().repaint();
    }
  }

  private Dice dice;
  private DiceView view;

  public DicePresenter(DiceView view) {
    this.view = view;
    dice = new Dice();
    view.getCanvas().setDice(dice);
    view.getRollTheDice().addActionListener(new RollTheDiceActionListener());
  }

}
