package jappuccini.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Minderjaehrige Studierende
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FilteredTeenStudents {

   private final List<Student> students;

   public FilteredTeenStudents() {
      students = new ArrayList<>();
   }

   public void add(Student student) {
      if (student.age() < 18) {
         students.add(student);
      }
   }

   public void printStudents() {
      students.forEach(System.out::println);
   }

}
