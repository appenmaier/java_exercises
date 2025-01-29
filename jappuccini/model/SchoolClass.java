package jappuccini.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Schulklasse
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record SchoolClass(String name, List<Pupil> pupils) {

   public void addPupil(Pupil pupil) {
      pupils.add(pupil);
   }

   public List<Pair<Pupil>> getPairs() {
      List<Pair<Pupil>> pairs = new ArrayList<>();

      for (int i = 0; i < pupils.size(); i++) {
         Pupil single1 = pupils.get((new Random().nextInt(pupils.size())));
         pupils.remove(single1);
         Pupil single2 = pupils.get((new Random().nextInt(pupils.size())));
         pupils.remove(single2);
         pairs.add(new Pair<Pupil>(single1, single2));
      }

      if (pupils.size() == 1) {
         pairs.add(new Pair<Pupil>(pupils.get(0), null));
      }

      return pairs;
   }

}
