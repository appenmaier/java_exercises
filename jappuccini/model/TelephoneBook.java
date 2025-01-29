package jappuccini.model;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Telefonbuch
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public record TelephoneBook(Map<Person, TelephoneNumber> entries) {

   public void addEntry(Person person, TelephoneNumber telephoneNumber) {
      entries.put(person, telephoneNumber);
   }

   public Optional<TelephoneNumber> getTelephoneNumberByName(String name) {
      for (Entry<Person, TelephoneNumber> entry : entries.entrySet()) {
         if (entry.getKey().name().equals(name)) {
            return Optional.ofNullable(entry.getValue());
         }
      }
      return Optional.empty();
      // return Optional.ofNullableNullable(entries.get(new Person(name)));
   }
   /*
    * version 1.0: public TelephoneNumber getTelephoneNumberByName(String name) { for (Entry<Person,
    * TelephoneNumber> entry : entries.entrySet()) { if (entry.getKey().name().equals(name)) {
    * return entry.getValue(); } } return null; // return entries.get(new Person(name)); }
    */

}
