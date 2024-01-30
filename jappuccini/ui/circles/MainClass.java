package jappuccini.ui.circles;

public class MainClass {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    CirclesView view = new CirclesView();
    CirclesPresenter presenter = new CirclesPresenter(view);
    view.setVisible(true);
  }

}
