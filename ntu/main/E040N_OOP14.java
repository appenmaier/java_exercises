package ntu.main;

import ntu.model.Employee;

/**
 * Aufgabe OOP 1.4
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E040N_OOP14 {

  public static void main(String[] args) {

    Employee e1 = new Employee(8, "Peter", "Tan", 2500);
    System.out.println(e1);

    e1.setSalary(999);
    System.out.println(e1);
    System.out.println("id is: " + e1.getId());
    System.out.println("firstname is: " + e1.getFirstName());
    System.out.println("lastname is: " + e1.getLastName());
    System.out.println("salary is: " + e1.getSalary());

    System.out.println("name is: " + e1.getName());
    System.out.println("annual salary is: " + e1.getAnnualSalary());

    System.out.println(e1.raiseSalary(10));
    System.out.println(e1);

  }

}
