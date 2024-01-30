package jappuccini.model;

import java.util.ArrayList;

/**
 * Videospielkonsolen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class VideoGameConsoles {

  public static enum Maker {
    NINTENDO, SONY, MICROSOFT;
  }
  public static record VideoGameConsole(String title, Maker maker, int lifespan,
      double soldUnitsInMillions) {

  }

  private final static VideoGameConsole PS2 =
      new VideoGameConsole("PlayStation 2", Maker.SONY, 12, 158.70);
  private final static VideoGameConsole DS =
      new VideoGameConsole("Nintendo DS", Maker.NINTENDO, 10, 154.02);
  private final static VideoGameConsole NS =
      new VideoGameConsole("Nintendo Switch", Maker.NINTENDO, -1, 125.79);
  private final static VideoGameConsole GB =
      new VideoGameConsole("GameBoy", Maker.NINTENDO, 10, 118.69);
  private final static VideoGameConsole PS4 =
      new VideoGameConsole("PlayStation 4", Maker.SONY, -1, 117.04);
  private final static VideoGameConsole PSX =
      new VideoGameConsole("PlayStation", Maker.SONY, 9, 102.49);
  private final static VideoGameConsole WII =
      new VideoGameConsole("Nintendo Wii", Maker.NINTENDO, 13, 101.63);
  private final static VideoGameConsole PS3 =
      new VideoGameConsole("PlayStation 3", Maker.SONY, 11, 87.40);
  private final static VideoGameConsole X360 =
      new VideoGameConsole("XBox 360", Maker.MICROSOFT, 12, 85.81);
  private final static VideoGameConsole GBA =
      new VideoGameConsole("GameBoy Advance", Maker.NINTENDO, 7, 81.51);
  private final static VideoGameConsole PSP =
      new VideoGameConsole("PlayStation Portable", Maker.SONY, 9, 80.79);
  private final static VideoGameConsole TDS =
      new VideoGameConsole("Nintendo 3DS", Maker.NINTENDO, 8, 75.94);
  private final static VideoGameConsole NES =
      new VideoGameConsole("Nintendo Entertainment System", Maker.NINTENDO, 9, 61.91);
  private final static VideoGameConsole XONE =
      new VideoGameConsole("XBox One", Maker.MICROSOFT, -1, 51.26);
  private final static VideoGameConsole SNES =
      new VideoGameConsole("Super Nintendo Entertainment System", Maker.NINTENDO, 7, 49.10);

  public static ArrayList<VideoGameConsole> getVideoGameConsoles() {
    ArrayList<VideoGameConsole> videoGameConsoles = new ArrayList<>();
    videoGameConsoles.add(PS2);
    videoGameConsoles.add(DS);
    videoGameConsoles.add(NS);
    videoGameConsoles.add(GB);
    videoGameConsoles.add(PS4);
    videoGameConsoles.add(PSX);
    videoGameConsoles.add(WII);
    videoGameConsoles.add(PS3);
    videoGameConsoles.add(X360);
    videoGameConsoles.add(GBA);
    videoGameConsoles.add(PSP);
    videoGameConsoles.add(TDS);
    videoGameConsoles.add(NES);
    videoGameConsoles.add(XONE);
    videoGameConsoles.add(SNES);
    return videoGameConsoles;
  }

}
