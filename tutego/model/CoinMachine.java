package tutego.model;

/**
 * Muenzmaschine
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class CoinMachine {

  public static void printCoins(double amount) {

    int numberOf2Liretta = (int) (amount / 2);
    amount -= numberOf2Liretta * 2;

    int numberOf1Liretta = (int) amount;
    amount -= numberOf1Liretta;

    int numberOf50Lirettacent = (int) (amount / 0.5);
    amount -= numberOf50Lirettacent * 0.5;

    int numberOf20Lirettacent = (int) (amount / 0.2);
    amount -= numberOf20Lirettacent * 0.2;

    int numberOf10Lirettacent = (int) (amount / 0.1);
    amount -= numberOf10Lirettacent * 0.1;

    int numberOf5Lirettacent = (int) (amount / 0.05);
    amount -= numberOf5Lirettacent * 0.05;

    int numberOf2Lirettacent = (int) (amount / 0.02);
    amount -= numberOf2Lirettacent * 0.02;

    int numberOf1Lirettacent = (int) (amount / 0.01);
    amount -= numberOf1Lirettacent * 0.01;

    System.out.println(numberOf2Liretta + " x 2 Liretta");
    System.out.println(numberOf1Liretta + " x 1 Liretta");
    System.out.println(numberOf50Lirettacent + " x 50 Lirettacent");
    System.out.println(numberOf20Lirettacent + " x 20 Lirettacent");
    System.out.println(numberOf10Lirettacent + " x 10 Lirettacent");
    System.out.println(numberOf5Lirettacent + " x 5 Lirettacent");
    System.out.println(numberOf2Lirettacent + " x 2 Lirettacent");
    System.out.println(numberOf1Lirettacent + " x 1 Lirettacent");

  }

}
