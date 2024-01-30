package jappuccini.model;

import java.util.ArrayList;

/**
 * Unternehmen
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class Company {

  /**
   * Mitarbeiter
   * 
   * @author Daniel Appenmaier
   * @version 2.0
   */
  public class Employee {

    private int employeeId;
    private Person person;
    private int salary;

    public Employee(int employeeId, Person person, int salary) {
      this.employeeId = employeeId;
      this.person = person;
      this.salary = salary;
    }

    public int getEmployeeId() {
      return employeeId;
    }

    public String getName() {
      return person.name();
    }

    public int getSalary() {
      return salary;
    }

    public void print() {
      System.out.println(employeeId + " - " + getName() + " - " + salary + " Euro");
    }

    public void setSalary(int salary)
        throws SalaryDecreaseException, SalaryIncreaseTooHighException {
      if (salary < this.salary) {
        throw new SalaryDecreaseException();
      }

      double increase = (double) (salary - this.salary) / this.salary;
      if (increase > 0.1) {
        throw new SalaryIncreaseTooHighException();
      }

      this.salary = salary;
    }
    /*
     * version 1.0: public void setSalary(int salary) { this.salary = salary; }
     */

  }
  /* version 1.0: - */

  private String name;

  private ArrayList<Employee> employees;

  private int numberOfEmployees;

  public Company(String name) {
    this.name = name;
    employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
    numberOfEmployees++;
  }

  public void print() {
    System.out.println(name + " (" + numberOfEmployees + " Mitarbeiter)");
    for (Employee e : employees) {
      e.print();
    }
  }

}
