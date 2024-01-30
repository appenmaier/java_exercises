package jappuccini.ui.balls;

public class MainClass {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    BallsView view = new BallsView();
    BallsPresenter presenter = new BallsPresenter(view);
    view.setVisible(true);
  }

}
