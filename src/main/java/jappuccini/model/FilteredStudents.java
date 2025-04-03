package jappuccini.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Studierende
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class FilteredStudents {

   private final List<Student> students;
   private final Predicate<Student> mandatoryFilter;

   public FilteredStudents(Predicate<Student> mandatoryFilter) {
      students = new ArrayList<>();
      this.mandatoryFilter = mandatoryFilter;
   }

   public void add(Student student) {
      if (mandatoryFilter.test(student)) {
         students.add(student);
      }
   }

   public void forEach(Consumer<Student> consumer) {
      for (Student s : students) {
         consumer.accept(s);
      }
   }
   /* version 1.0: public void printStudents() { students.forEach(System.out::println); } */

}
