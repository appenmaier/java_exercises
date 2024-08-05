package jappuccini.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Haus
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class House {

  /**
   * Raum
   *
   * @author Daniel Appenmaier
   * @version 1.0
   *
   */
  public class Room {

    private final String name;

    public Room(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null) {
        return false;
      }
      if (getClass() != obj.getClass()) {
        return false;
      }
      Room other = (Room) obj;
      if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
        return false;
      }
      return Objects.equals(name, other.name);
    }

    private House getEnclosingInstance() {
      return House.this;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + getEnclosingInstance().hashCode();
      result = prime * result + Objects.hash(name);
      return result;
    }

    public String name() {
      return name;
    }

    @Override
    public String toString() {
      return "Room [name=" + name + "]";
    }

  }

  private final List<Room> rooms;

  public House() {
    rooms = new ArrayList<>();
  }

  public void addRoom(Room room) {
    rooms.add(room);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    House other = (House) obj;
    return Objects.equals(rooms, other.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rooms);
  }

  @Override
  public String toString() {
    return "House [rooms=" + rooms + "]";
  }

}
