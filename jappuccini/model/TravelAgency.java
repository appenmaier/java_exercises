package jappuccini.model;

import java.util.ArrayList;

/**
 * Reisebuero
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TravelAgency {

  private final String name;
  private ArrayList<Partner> partners;

  public TravelAgency(String name) {
    this.name = name;
    partners = new ArrayList<>();
  }

  public void addPartner(Partner partner) {
    partners.add(partner);
  }

  @Override
  public String toString() {
    return "TravelAgency [name=" + name + ", partners=" + partners + "]";
  }

}
