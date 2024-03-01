package ntu.model;

/**
 * Rechnungsposition
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InvoiceItem {

  private String desc;
  private String id;
  private int qty;
  private double unitPrice;

  public InvoiceItem(String id, String desc, int qty, double unitPrice) {
    this.id = id;
    this.desc = desc;
    this.qty = qty;
    this.unitPrice = unitPrice;
  }

  public String getDesc() {
    return desc;
  }

  public String getId() {
    return id;
  }

  public int getQty() {
    return qty;
  }

  public double getTotal() {
    return unitPrice * qty;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  @Override
  public String toString() {
    return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice
        + "]";
  }

}
