package jappuccini.ui.dice;

public class MainClass {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    DiceView view = new DiceView();
    DicePresenter presenter = new DicePresenter(view);
    view.setVisible(true);
  }

}
