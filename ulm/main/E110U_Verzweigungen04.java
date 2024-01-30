package ulm.main;

import java.util.Scanner;

/**
 * Aufgabe Verzweigungen-4
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E110U_Verzweigungen04 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Bitte gib den Preis pro KG in Euro ein: ");
    double price = sc.nextDouble();

    System.out.print("Bitte gib die Menge ein: ");
    int amount = sc.nextInt();

    double discountRate;

    if (amount < 10) {
      discountRate = 0;
    } else if (amount < 50) {
      discountRate = 0.1;
    } else {
      discountRate = 0.2;
    }

    double totalAmountWithoutDiscount = price * amount;
    double discount = totalAmountWithoutDiscount * discountRate;
    double totalAmountWithDiscount = totalAmountWithoutDiscount - discount;

    System.out.println("Zwischenbetrag: " + (int) totalAmountWithoutDiscount + " Euro");
    System.out.println("Rabatt: " + (int) discount + " Euro");
    System.out.println("Endbetrag: " + (int) totalAmountWithDiscount + " Euro");

  }

}
