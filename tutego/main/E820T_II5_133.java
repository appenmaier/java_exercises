package tutego.main;

import java.util.Scanner;
import tutego.model.Inputs;
import tutego.model.Inputs.Input;

/**
 * Aufgabe IOStreams-1.3.3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E820T_II5_133 {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Inputs inputs = Inputs.getInputs();

    for (String line; (line = new Scanner(System.in).nextLine()) != null;) {
      System.out.println(line.toUpperCase());
      Input input = new Input();
      input.input = line;
      inputs.addInput(input);
    }

  }

}
