package jappuccini.main;

import jappuccini.model.Company;
import jappuccini.model.Person;

/**
 * Exceptions03
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class E570_Exceptions03 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    Company company = new Company("Maier GmbH");

    Person p1 = new Person("Max Schmid");
    Person p2 = new Person("Hans Mueller");
    Person p3 = new Person("Lisa Meier");

    /*
     * version 1.0: Employee e1 = new Employee(1, p1, 50000); Employee e2 = new Employee(2, p2,
     * 75000); Employee e3 = new Employee(3, p3, 40000); company.addEmployee(e1);
     * company.addEmployee(e2); company.addEmployee(e3); company.addEmployee(new Employee(4, new
     * Person("Peter Schneider"), 55000)); company.addEmployee(new Employee(5, new
     * Person("Miriam Albers"), 90000)); try { e1.setSalary(55000); e2.setSalary(77000);
     * e3.setSalary(45000); } catch (SalaryDecreaseException | SalaryIncreaseTooHighException e) {
     * System.err.println(e.getMessage()); }
     */

    company.print();

  }

}
