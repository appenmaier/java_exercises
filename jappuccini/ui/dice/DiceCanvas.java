package jappuccini.ui.dice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DiceCanvas extends JPanel {

  private Dice dice;

  public DiceCanvas() {
    setBackground(Color.WHITE);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Rectangle bounds = g.getClipBounds();
    int x = (int) bounds.getCenterX() - 45;
    int y = (int) bounds.getCenterY() - 45;
    try {
      BufferedImage image = switch (dice.getValue()) {
        case 1 -> ImageIO.read(new File("src/jappuccini/ui/dice/one.png"));
        case 2 -> ImageIO.read(new File("src/jappuccini/ui/dice/two.png"));
        case 3 -> ImageIO.read(new File("src/jappuccini/ui/dice/three.png"));
        case 4 -> ImageIO.read(new File("src/jappuccini/ui/dice/four.png"));
        case 5 -> ImageIO.read(new File("src/jappuccini/ui/dice/five.png"));
        case 6 -> ImageIO.read(new File("src/jappuccini/ui/dice/six.png"));
        default -> null;
      };
      g.drawImage(image, x, y, null);
    } catch (IOException e) {
      g.drawString(String.valueOf(dice.getValue()), x, y);
    }
  }

  public void setDice(Dice dice) {
    this.dice = dice;
  }

}
