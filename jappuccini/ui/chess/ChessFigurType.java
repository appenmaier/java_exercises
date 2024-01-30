package jappuccini.ui.chess;

public enum ChessFigurType {

  BISHOP("Laeufer"), KING("Koenig"), KNIGHT("Springer"), PAWN("Bauer"), QUEEN("Dame"), ROOK("Turm");

  private String description;

  ChessFigurType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}
