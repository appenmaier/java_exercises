package jappuccini.main;

import java.util.ArrayList;

import jappuccini.model.Pupil;
import jappuccini.model.SchoolClass;

/**
 * Generics03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E650_Generics03 {

   public static void main(String[] args) {

      SchoolClass schoolClass = new SchoolClass("9c", new ArrayList<>());

      schoolClass.addPupil(new Pupil("Hans", "m"));
      schoolClass.addPupil(new Pupil("Peter", "m"));
      schoolClass.addPupil(new Pupil("Lisa", "w"));
      schoolClass.addPupil(new Pupil("Fritz", "m"));
      schoolClass.addPupil(new Pupil("Max", "m"));
      schoolClass.addPupil(new Pupil("Franziska", "w"));
      schoolClass.addPupil(new Pupil("Jennifer", "w"));

      schoolClass.getPairs().forEach(System.out::println);

   }

}
