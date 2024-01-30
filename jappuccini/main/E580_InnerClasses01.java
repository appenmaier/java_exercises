package jappuccini.main;

import jappuccini.model.House;

/**
 * InnerClasses01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E580_InnerClasses01 {

  public static void main(String[] args) {

    House house = new House();

    house.addRoom(house.new Room("Wohnzimmer"));
    house.addRoom(house.new Room("Esszimmer"));
    house.addRoom(house.new Room("Schlafzimmer"));
    house.addRoom(house.new Room("Kueche"));
    house.addRoom(house.new Room("WC"));

    house.displayRooms();

  }

}
