package jappuccini.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jappuccini.model.Author;
import jappuccini.model.Book;
import jappuccini.model.BookCollection;
import jappuccini.model.DuplicateKeyException;

/**
 * UnitTests04
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E770_UnitTests04 {

  private Book aClashOfKings;
  private Book aGameOfThrones;
  private BookCollection bookCollection;
  private Author georgeRRMartin;
  private Book it;
  private Book misery;
  private Author stephenKing;

  @BeforeEach
  void setUp() throws DuplicateKeyException {
    stephenKing = new Author("Stephen King");
    georgeRRMartin = new Author("George RR Martin");

    it = new Book("Es");
    misery = new Book("Sie");
    aGameOfThrones = new Book("Das Lied von Eis und Feuer 1");
    aClashOfKings = new Book("Das Lied von Eis und Feuer 2");

    bookCollection = new BookCollection(new HashMap<>());
    bookCollection.addAuthor(stephenKing);
    bookCollection.addAuthor(georgeRRMartin);
    bookCollection.addBook(georgeRRMartin, aGameOfThrones);
    bookCollection.addBook(georgeRRMartin, aClashOfKings);
  }

  @Test
  void testAddAuthor() {
    assertThrows(DuplicateKeyException.class, () -> bookCollection.addAuthor(stephenKing));
  }

  @Test
  void testAddBook() {
    bookCollection.addBook(stephenKing, it);
    bookCollection.addBook(stephenKing, misery);
    List<Book> booksFromStephenKing = bookCollection.collection()
        .get(stephenKing);
    assertEquals(it, booksFromStephenKing.get(0));
    assertEquals(misery, booksFromStephenKing.get(1));
    assertEquals(2, booksFromStephenKing.size());
  }

  @Test
  void testGetBookByTitle() {
    assertEquals(Optional.of(aClashOfKings),
        bookCollection.getBookByTitle("Das Lied von Eis und Feuer 2"));
    assertEquals(Optional.empty(), bookCollection.getBookByTitle("Das Lied von Eis und Feuer 3"));
  }

  @Test
  void testGetMostDiligentAuthor1() {
    assertEquals(Optional.of(georgeRRMartin), bookCollection.getMostDiligentAuthor());
  }

  @Test
  void testGetMostDiligentAuthor2() {
    bookCollection = new BookCollection(new HashMap<>());
    assertEquals(Optional.empty(), bookCollection.getMostDiligentAuthor());
  }

}
