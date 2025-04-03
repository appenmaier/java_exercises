package jappuccini.model;

import java.util.List;

/**
 * Turnier
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Tournament(String title, List<Club> clubs, List<Pair<Club>> pairs) {

   public void addClub(Club club) {
      clubs.add(club);
   }

   public List<Pair<Club>> pairs() {
      for (int i = 0; i < clubs.size(); i++) {
         for (int j = 0; j < clubs.size(); j++) {
            if (i != j) {
               pairs.add(new Pair<Club>(clubs.get(i), clubs.get(j)));
            }
         }
      }

      return pairs;
   }

}
