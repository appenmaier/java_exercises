package tutego.main;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Lambda-1.1.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E700T_I13_111 {

  public static void main(String[] args) {

    @SuppressWarnings("unused")
    Runnable runnable = () -> System.out.println("Runnable");
    @SuppressWarnings("unused")
    ActionListener listener = e -> System.out.println("ActionListener");
    @SuppressWarnings("unused")
    Supplier<String> supplier = () -> "Supplier";
    @SuppressWarnings("unused")
    Consumer<Point> point = t -> System.out.println("Consumer");
    @SuppressWarnings("unused")
    Comparator<Rectangle> comparator = (o1, o2) -> o1.hashCode() - o2.hashCode();

  }

}
