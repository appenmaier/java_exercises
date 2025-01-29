package jappuccini.main;

import jappuccini.model.FilteredStudents;
import jappuccini.model.Student;

/**
 * Lambdas02
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class E620_Lambdas02 {

   public static void main(String[] args) {

      FilteredStudents adultStudents = new FilteredStudents(s -> s.age() >= 18);
      // FilteredAdultStudents adultStudents = new FilteredAdultStudents();
      adultStudents.add(new Student("Hans", 19));
      adultStudents.add(new Student("Peter", 17));
      adultStudents.add(new Student("Lisa", 18));

      /* version 1.0: adultStudents.printStudents(); */
      System.out.println();

      FilteredStudents teenStudents = new FilteredStudents(s -> s.age() < 18);
      // FilteredTeenStudents teenStudents = new FilteredTeenStudents();
      teenStudents.add(new Student("Hans", 19));
      teenStudents.add(new Student("Peter", 17));
      teenStudents.add(new Student("Lisa", 20));

      /* version 1.0: teenStudents.printStudents(); */

   }

}
