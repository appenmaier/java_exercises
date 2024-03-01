package ntu.model;

/**
 * Mitarbeiter
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Employee {

  private String firstName;
  private int id;
  private String lastName;
  private int salary;

  public Employee(int id, String firstName, String lastName, int salary) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public int getAnnualSalary() {
    return salary * 12;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getId() {
    return id;
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public int getSalary() {
    return salary;
  }

  public int raiseSalary(int percent) {
    salary += salary * percent / 100;
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
        + ", salary=" + salary + "]";
  }

}
