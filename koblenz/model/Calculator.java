package koblenz.model;

/**
 * Rechner
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 * 
 */
public class Calculator {

  final static double VAT = 0.19;

  final static double REDUCED_VAT = 0.07;

  public static double addVAT(double netAmount, boolean isReducedVAT) {
    double totalAmount;

    if (isReducedVAT) {
      totalAmount = netAmount + netAmount * REDUCED_VAT;
    } else {
      totalAmount = netAmount + netAmount * VAT;
    }

    return totalAmount;
  }

  public static int calculateSumWithDoWile(int start, int end) {
    int i = start;
    int total = 0;

    do {
      total += i;
      i++;
    } while (i <= end);

    return total;
  }
  /* version 2: - */

  public static int calculateSumWithFor(int start, int end) {
    int total = 0;

    for (int i = start; i <= end; i++) {
      total += i;
    }

    return total;
  }
  /* version 2: - */

  public static int calculateSumWithWile(int start, int end) {
    int i = start;
    int total = 0;

    while (i <= end) {
      total += i;
      i++;
    }

    return total;
  }
  /* version 1: - */

  public static double exchangeDMToEuro(double amountInDM) {
    double amountInEUR;
    double exchangeRateFromEURToDM = 1.95583;

    amountInEUR = amountInDM / exchangeRateFromEURToDM;

    return amountInEUR;
  }

  public static double exchangeEuroToDM(double amountInEuro) {
    double amountInDM;
    double exchangeRateFromEURToDM = 1.95583;

    amountInDM = amountInEuro * exchangeRateFromEURToDM;

    return amountInDM;
  }

}
