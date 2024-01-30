package jappuccini.model;

import java.util.ArrayList;

/**
 * Haus
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class House {

  public class Room {

    private String name;

    public Room(String name) {
      this.name = name;
    }

    public void displayRoom() {
      System.out.println(name);
    }

  }

  private ArrayList<Room> rooms;

  public House() {
    rooms = new ArrayList<>();
  }

  public void addRoom(Room room) {
    rooms.add(room);
  }

  public void displayRooms() {
    for (Room r : rooms) {
      r.displayRoom();
    }
  }

}
