package ntu.model;

/**
 * Kunde
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Customer {

  private int discount;
  private int id;
  private String name;

  public Customer(int id, String name, int discount) {
    this.id = id;
    this.name = name;
    this.discount = discount;
  }

  public int getDiscount() {
    return discount;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  @Override
  public String toString() {
    return name + " (" + id + ") (" + discount + "%)";
  }

}
