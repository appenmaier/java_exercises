package jappuccini.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

      private final int employeeId;
      private final Person person;
      private int salaryInEuro;

      public Employee(int employeeId, Person person, int salaryInEuro) {
         this.employeeId = employeeId;
         this.person = person;
         this.salaryInEuro = salaryInEuro;
      }

      public int employeeId() {
         return employeeId;
      }

      @Override
      public boolean equals(Object obj) {
         if (this == obj) {
            return true;
         }
         if (obj == null) {
            return false;
         }
         if (getClass() != obj.getClass()) {
            return false;
         }
         Employee other = (Employee) obj;
         if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
            return false;
         }
         return employeeId == other.employeeId && Objects.equals(person, other.person)
               && salaryInEuro == other.salaryInEuro;
      }

      private Company getEnclosingInstance() {
         return Company.this;
      }

      public int getSalaryInEuro() {
         return salaryInEuro;
      }

      @Override
      public int hashCode() {
         final int prime = 31;
         int result = 1;
         result = prime * result + getEnclosingInstance().hashCode();
         result = prime * result + Objects.hash(employeeId, person, salaryInEuro);
         return result;
      }

      public String name() {
         return person.name();
      }

      public void setSalaryInEuro(int salaryInEuro)
            throws SalaryDecreaseException, SalaryIncreaseTooHighException {
         if (salaryInEuro < this.salaryInEuro) {
            throw new SalaryDecreaseException();
         }

         double increase = (double) (salaryInEuro - this.salaryInEuro) / this.salaryInEuro;
         if (increase > 0.1) {
            throw new SalaryIncreaseTooHighException();
         }

         this.salaryInEuro = salaryInEuro;
      }
      /*
       * version 1.0: public void setSalaryInEuro(int salaryInEuro) { this.salaryInEuro =
       * salaryInEuro; }
       */

      @Override
      public String toString() {
         return "Employee [employeeId=" + employeeId + ", person=" + person + ", salaryInEuro="
               + salaryInEuro + "]";
      }

   }
   /* version 1.0: - */

   private final String name;
   private final List<Employee> employees;
   private int numberOfEmployees;

   public Company(String name) {
      this.name = name;
      employees = new ArrayList<>();
   }

   public void addEmployee(Employee employee) {
      employees.add(employee);
      numberOfEmployees++;
   }

   public List<Employee> employees() {
      return employees;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Company other = (Company) obj;
      return Objects.equals(employees, other.employees) && Objects.equals(name, other.name)
            && numberOfEmployees == other.numberOfEmployees;
   }

   @Override
   public int hashCode() {
      return Objects.hash(employees, name, numberOfEmployees);
   }

   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Company [name=" + name + ", employees=" + employees + ", numberOfEmployees="
            + numberOfEmployees + "]";
   }

}
