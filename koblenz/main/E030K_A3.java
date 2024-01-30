package koblenz.main;

/**
 * Aufgabe A3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E030K_A3 {

  public static void main(String[] args) {

    // System.out.println("9876,54DM = " + (9876.54 / 1.95583) + "EUR");

    double amountInEUR;
    double amountInDM = 9876.54;
    double exchangeRateFromEURToDM = 1.95583;

    amountInEUR = amountInDM / exchangeRateFromEURToDM;

    System.out.println(amountInDM + "DM = " + amountInEUR + "EUR");

  }

}
