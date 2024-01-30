package jappuccini.main;

import java.util.Scanner;

/**
 * Cases02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E100_Cases02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte den ersten Operanden ein: ");
    int operand1 = sc.nextInt();

    System.out.print("Gib bitte den Operator ein: ");
    char operator = sc.next().charAt(0);

    System.out.print("Gib bitte den zweiten Operanden ein: ");
    int operand2 = sc.nextInt();

    double result;

    if (operator == '+') {
      result = operand1 + operand2;
    } else if (operator == '-') {
      result = operand1 - operand2;
    } else if (operator == '*') {
      result = operand1 * operand2;
    } else {
      result = (double) operand1 / operand2;
    }

    // switch (operator) {
    // case '+':
    // result = operand1 + operand2;
    // break;
    // case '-':
    // result = operand1 - operand2;
    // break;
    // case '*':
    // result = operand1 * operand2;
    // break;
    // default:
    // result = (double) operand1 / operand2;
    // break;
    // }

    // result = switch (operator) {
    // case '+' -> operand1 + operand2;
    // case '-' -> operand1 - operand2;
    // case '*' -> operand1 * operand2;
    // default -> (double) operand1 / operand2;
    // };

    System.out.printf("Ergebnis: %d %c %d = %.2f", operand1, operator, operand2, result);

  }

}
