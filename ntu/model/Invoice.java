package ntu.model;

/**
 * Rechnung
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Invoice {

  private double amount;
  private Customer customer;
  private int id;

  public Invoice(int id, Customer customer, double amount) {
    this.id = id;
    this.customer = customer;
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

  public double getAmountAfterDiscount() {
    return amount - (amount * customer.getDiscount() / 100);
  }

  public Customer getCustomer() {
    return customer;
  }

  public int getCustomerDiscount() {
    return customer.getDiscount();
  }

  public int getCustomerId() {
    return customer.getId();
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public int getId() {
    return id;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  @Override
  public String toString() {
    return "Invoice [amount=" + amount + ", customer=" + customer + ", id=" + id + "]";
  }

}
