package jappuccini.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Konsole
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Console(String title, Maker maker, int lifespan, double soldUnitsInMillions) {

  public enum Maker {
    NINTENDO, SONY, MICROSOFT;
  }

  public static List<Console> getConsoles() {
    List<Console> videoGameConsoles = new ArrayList<>();
    videoGameConsoles.add(new Console("PlayStation 2", Maker.SONY, 12, 158.70));
    videoGameConsoles.add(new Console("Nintendo DS", Maker.NINTENDO, 10, 154.02));
    videoGameConsoles.add(new Console("Nintendo Switch", Maker.NINTENDO, -1, 125.79));
    videoGameConsoles.add(new Console("GameBoy", Maker.NINTENDO, 10, 118.69));
    videoGameConsoles.add(new Console("PlayStation 4", Maker.SONY, -1, 117.04));
    videoGameConsoles.add(new Console("PlayStation", Maker.SONY, 9, 102.49));
    videoGameConsoles.add(new Console("Nintendo Wii", Maker.NINTENDO, 13, 101.63));
    videoGameConsoles.add(new Console("PlayStation 3", Maker.SONY, 11, 87.40));
    videoGameConsoles.add(new Console("XBox 360", Maker.MICROSOFT, 12, 85.81));
    videoGameConsoles.add(new Console("GameBoy Advance", Maker.NINTENDO, 7, 81.51));
    videoGameConsoles.add(new Console("PlayStation Portable", Maker.SONY, 9, 80.79));
    videoGameConsoles.add(new Console("Nintendo 3DS", Maker.NINTENDO, 8, 75.94));
    videoGameConsoles.add(new Console("Nintendo Entertainment System", Maker.NINTENDO, 9, 61.91));
    videoGameConsoles.add(new Console("XBox One", Maker.MICROSOFT, -1, 51.26));
    videoGameConsoles
        .add(new Console("Super Nintendo Entertainment System", Maker.NINTENDO, 7, 49.10));
    return videoGameConsoles;
  }

}
