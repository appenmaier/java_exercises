package tutego.main;

import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.UnaryOperator;

/**
 * Aufgabe Lambda-1.1.2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E710T_I13_112 {

  public static void main(String[] args) {

    @SuppressWarnings("unused")
    DoubleSupplier ds = () -> 0.0;
    @SuppressWarnings("unused")
    LongToDoubleFunction ltdf = value -> 1L;
    @SuppressWarnings("unused")
    UnaryOperator<String> up = t -> "";

  }

}
