package jappuccini.ui.chess;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public abstract class ChessFigurFactory {

  public static Map<Integer, ChessFigur> createChessFigurSet(boolean isWhite) {
    Color color = isWhite ? Color.WHITE : Color.BLACK;

    ImageIcon rookIcon = isWhite ? new ImageIcon("src/jappuccini/ui/chess/rook_white.png")
        : new ImageIcon("src/jappuccini/ui/chess/rook_black.png");
    ImageIcon bishopIcon = isWhite ? new ImageIcon("src/jappuccini/ui/chess/bishop_white.png")
        : new ImageIcon("src/jappuccini/ui/chess/bishop_black.png");
    ImageIcon knightIcon = isWhite ? new ImageIcon("src/jappuccini/ui/chess/knight_white.png")
        : new ImageIcon("src/jappuccini/ui/chess/knight_black.png");
    ImageIcon kingIcon = isWhite ? new ImageIcon("src/jappuccini/ui/chess/king_white.png")
        : new ImageIcon("src/jappuccini/ui/chess/king_black.png");
    ImageIcon queenIcon = isWhite ? new ImageIcon("src/jappuccini/ui/chess/queen_white.png")
        : new ImageIcon("src/jappuccini/ui/chess/queen_black.png");
    ImageIcon pawnIcon = isWhite ? new ImageIcon("src/jappuccini/ui/chess/pawn_white.png")
        : new ImageIcon("src/jappuccini/ui/chess/pawn_black.png");

    Map<Integer, ChessFigur> chessFigurs = new HashMap<>();
    for (ChessFigurType type : ChessFigurType.values()) {
      switch (type) {
        case ROOK:
          chessFigurs.put(0, new ChessFigur(type, color, rookIcon));
          chessFigurs.put(7, new ChessFigur(type, color, rookIcon));
          break;
        case KNIGHT:
          chessFigurs.put(1, new ChessFigur(type, color, knightIcon));
          chessFigurs.put(6, new ChessFigur(type, color, knightIcon));
          break;
        case BISHOP:
          chessFigurs.put(2, new ChessFigur(type, color, bishopIcon));
          chessFigurs.put(5, new ChessFigur(type, color, bishopIcon));
          break;
        case QUEEN:
          chessFigurs.put(isWhite ? 4 : 3, new ChessFigur(type, color, queenIcon));
          break;
        case KING:
          chessFigurs.put(isWhite ? 3 : 4, new ChessFigur(type, color, kingIcon));
          break;
        case PAWN:
          chessFigurs.put(8, new ChessFigur(type, color, pawnIcon));
          chessFigurs.put(9, new ChessFigur(type, color, pawnIcon));
          chessFigurs.put(10, new ChessFigur(type, color, pawnIcon));
          chessFigurs.put(11, new ChessFigur(type, color, pawnIcon));
          chessFigurs.put(12, new ChessFigur(type, color, pawnIcon));
          chessFigurs.put(13, new ChessFigur(type, color, pawnIcon));
          chessFigurs.put(14, new ChessFigur(type, color, pawnIcon));
          chessFigurs.put(15, new ChessFigur(type, color, pawnIcon));
          break;
        default:
          break;
      }
    }
    return chessFigurs;
  }

}
