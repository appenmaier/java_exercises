package jappuccini.model;

/**
 * SalaryIncreaseTooHighException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SalaryIncreaseTooHighException extends Exception {

  private static final long serialVersionUID = 1L;

  public SalaryIncreaseTooHighException() {
    super("Die Gehaltserhoehung ueberschreitet 10%");
  }

}
