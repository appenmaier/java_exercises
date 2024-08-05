package jappuccini.main;

import jappuccini.model.FilteredStudents;
import jappuccini.model.Student;

/**
 * Lambdas03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E620_Lambdas03 {

  public static void main(String[] args) {

    FilteredStudents adultStudents = new FilteredStudents(s -> s.age() >= 18);
    adultStudents.add(new Student("Hans", 19));
    adultStudents.add(new Student("Peter", 17));
    adultStudents.add(new Student("Lisa", 18));

    adultStudents.forEach(s -> System.out.println(s.name().toUpperCase()));
    System.out.println();

    FilteredStudents teenStudents = new FilteredStudents(s -> s.age() < 18);
    teenStudents.add(new Student("Hans", 19));
    teenStudents.add(new Student("Peter", 17));
    teenStudents.add(new Student("Lisa", 20));

    teenStudents.forEach(s -> System.out.println(s.name().toLowerCase()));

  }

}
