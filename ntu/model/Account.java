package ntu.model;

/**
 * Konto
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Account {

  private int balance;
  private String id;
  private String name;

  public Account(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public int credit(int amount) {
    balance += amount;
    return balance;
  }

  public int debit(int amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Amount exceeded balance");
    }
    return balance;
  }

  public int getBalance() {
    return balance;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
  }

  public int transferTo(Account another, int amount) {
    if (amount <= balance) {
      another.credit(amount);
      debit(amount);
    } else {
      System.out.println("Amount exceeded balance");
    }
    return balance;
  }

}
