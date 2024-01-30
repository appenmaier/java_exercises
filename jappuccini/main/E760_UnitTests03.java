package jappuccini.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jappuccini.model.Person;
import jappuccini.model.TelephoneBook;
import jappuccini.model.TelephoneNumber;

/**
 * UnitTests03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E760_UnitTests03 {

  private static TelephoneBook telephoneBook;

  @BeforeEach
  void setUp() {
    telephoneBook = new TelephoneBook();
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
