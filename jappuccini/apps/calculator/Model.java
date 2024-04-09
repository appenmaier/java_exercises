package jappuccini.apps.calculator;

public class Model {

  private Calculator calculator;
  private static Model instance;

  private Model() {
    calculator = new Calculator();
  }

  public static Model getInstance() {
    if (instance == null) {
      instance = new Model();
    }
    return instance;
  }

  public String calculate(String input) {
    String[] tokens = input.split(" ");
    int a = Integer.valueOf(tokens[0]);
    int b = Integer.valueOf(tokens[2]);

    return String.valueOf(switch (tokens[1]) {
      case "+" -> calculator.add(a, b);
      case "-" -> calculator.subtract(a, b);
      case "*" -> calculator.multiply(a, b);
      case "/" -> calculator.divide(a, b);
      default -> "";
    });
  }

}
