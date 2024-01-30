package tutego.main;

import java.util.Comparator;
import tutego.model.ElectronicDevice;
import tutego.model.IceMachine;
import tutego.model.Radio;
import tutego.model.TV;

/**
 * Aufgabe Nested-1.1.2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E690T_I10_112 {

  public static class ElectronicDeviceWattComparatorNested implements Comparator<ElectronicDevice> {
    @Override
    public int compare(ElectronicDevice o1, ElectronicDevice o2) {
      System.out.println("[compare] " + o1.toString() + ", " + o2.toString());
      Integer watt1 = o1.getWatt();
      Integer watt2 = o2.getWatt();
      return watt1.compareTo(watt2);
    }
  }

  public static void main(String[] args) {

    Radio radio1 = new Radio();
    radio1.setWatt(15);

    IceMachine iceMachine = new IceMachine();
    iceMachine.setWatt(150);

    TV tv = new TV();
    tv.setWatt(80);

    /* Geschachtelte Klasse */
    // Comparator<ElectronicDevice> comparator = new ElectronicDeviceWattComparatorNested();

    /* Lokale Klasse */
    // class ElectronicDeviceWattComparatorLocal implements Comparator<ElectronicDevice> {
    // @Override
    // public int compare(ElectronicDevice o1, ElectronicDevice o2) {
    // System.out.println("[compare] " + o1.toString() + ", " + o2.toString());
    // Integer watt1 = o1.getWatt();
    // Integer watt2 = o2.getWatt();
    // return watt1.compareTo(watt2);
    // }
    // }
    // Comparator<ElectronicDevice> comparator = new ElectronicDeviceWattComparatorLocal();

    /* Anonyme Klasse */
    // Comparator<ElectronicDevice> comparator = new Comparator<ElectronicDevice>() {
    // @Override
    // public int compare(ElectronicDevice o1, ElectronicDevice o2) {
    // System.out.println("[compare] " + o1.toString() + ", " + o2.toString());
    // Integer watt1 = o1.getWatt();
    // Integer watt2 = o2.getWatt();
    // return watt1.compareTo(watt2);
    // }
    // };

    /* Lambda-Ausdruck */
    Comparator<ElectronicDevice> comparator = (o1, o2) -> {
      System.out.println("[compare] " + o1.toString() + ", " + o2.toString());
      Integer watt1 = o1.getWatt();
      Integer watt2 = o2.getWatt();
      return watt1.compareTo(watt2);
    };

    int result;

    result = comparator.compare(radio1, iceMachine);
    System.out.println("result: " + result);
    System.out.println();

    result = comparator.compare(iceMachine, tv);
    System.out.println("result: " + result);
    System.out.println();

    result = comparator.compare(tv, radio1);
    System.out.println("result: " + result);
    System.out.println();

  }

}
