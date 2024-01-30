package jappuccini.ui.chess;

public class MainClass {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    ChessView view = new ChessView();
    ChessPresenter presenter = new ChessPresenter(view);
    view.setVisible(true);
  }

}
