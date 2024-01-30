package jappuccini.model;

/**
 * SalaryDecreaseException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SalaryDecreaseException extends Exception {

  private static final long serialVersionUID = 1L;

  public SalaryDecreaseException() {
    super("Gehaltsverminderung");
  }

}
