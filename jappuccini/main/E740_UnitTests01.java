package jappuccini.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jappuccini.model.Company;
import jappuccini.model.Company.Employee;
import jappuccini.model.Person;
import jappuccini.model.SalaryDecreaseException;
import jappuccini.model.SalaryIncreaseTooHighException;

/**
 * UnitTests01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E740_UnitTests01 {

  private static Company company;
  private static Employee employee;

  @BeforeEach
  void setUp() {
    company = new Company("Maier GmbH");
    employee = company.new Employee(1, new Person("Max Schmid"), 50000);
  }

  @Test
  void testSetSalary1() throws SalaryDecreaseException, SalaryIncreaseTooHighException {
    employee.setSalary(55000);
    assertEquals(55000, employee.getSalary());
  }

  @Test
  void testSetSalary2() {
    assertThrows(SalaryDecreaseException.class, () -> employee.setSalary(49999));
  }

  @Test
  void testSetSalary3() {
    assertThrows(SalaryIncreaseTooHighException.class, () -> employee.setSalary(55001));
  }

}
