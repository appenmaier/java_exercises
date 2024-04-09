package jappuccini.apps.circles;

import java.util.Random;
import javafx.scene.paint.Color;

public class Model {

  private static Model instance;

  private Model() {}

  public static Model getInstance() {
    if (instance == null) {
      instance = new Model();
    }
    return instance;
  }

  public Circle getCircle(int minX, int maxX, int minY, int maxY) {
    Random random = new Random();
    int r = random.nextInt(10, 50);
    int x = random.nextInt(minX, maxX - 2 * r);
    int y = random.nextInt(minY, maxY - 2 * r);
    double red = random.nextDouble(1);
    double green = random.nextDouble(1);
    double blue = random.nextDouble(1);
    double opacity = random.nextDouble(0.5, 1);
    Color color = new Color(red, green, blue, opacity);
    return new Circle(r, x, y, color);
  }

}
