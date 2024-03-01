package ntu.model;

/**
 * Buch
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BookWithAuthor {

  private Author author;
  private String name;
  private double price;
  private int qty;

  public BookWithAuthor(String name, Author author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public BookWithAuthor(String name, Author author, double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public Author getAuthor() {
    return author;
  }

  public String getAuthorName() {
    return author.getName();
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQty() {
    return qty;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  @Override
  public String toString() {
    return "Book[name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
  }

}
