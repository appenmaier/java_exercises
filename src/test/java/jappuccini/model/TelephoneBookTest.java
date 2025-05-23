package jappuccini.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TelephoneBookTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TelephoneBookTest {

   private static TelephoneBook telephoneBook;

   @BeforeEach
   void setUp() {
      telephoneBook = new TelephoneBook(new HashMap<>());
      telephoneBook.addEntry(new Person("Hans Maier"), new TelephoneNumber("0751 86253"));
   }

   @Test
   void testAddEntry() {
      telephoneBook.addEntry(new Person("Hans Maier"), new TelephoneNumber("07544 72345"));
      assertEquals(Optional.of(new TelephoneNumber("07544 72345")),
            telephoneBook.getTelephoneNumberByName("Hans Maier"));
   }

   @Test
   void testGetTelephoneNumberByName1() {
      assertEquals(Optional.of(new TelephoneNumber("0751 86253")),
            telephoneBook.getTelephoneNumberByName("Hans Maier"));
   }

   @Test
   void testGetTelephoneNumberByName2() {
      assertEquals(Optional.empty(), telephoneBook.getTelephoneNumberByName("Peter Mueller"));
   }

}
