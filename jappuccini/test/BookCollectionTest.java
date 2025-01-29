package jappuccini.test;

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
 * BookCollectionTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BookCollectionTest {

   private BookCollection bookCollection;
   private Author georgeRrMartin;
   private Author stephenKing;
   private Book it;
   private Book misery;
   private Book aClashOfKings;
   private Book aGameOfThrones;

   @BeforeEach
   void setUp() throws DuplicateKeyException {
      stephenKing = new Author("Stephen King");
      georgeRrMartin = new Author("George RR Martin");

      it = new Book("Es");
      misery = new Book("Sie");
      aGameOfThrones = new Book("Das Lied von Eis und Feuer 1");
      aClashOfKings = new Book("Das Lied von Eis und Feuer 2");

      bookCollection = new BookCollection(new HashMap<>());
      bookCollection.addAuthor(stephenKing);
      bookCollection.addAuthor(georgeRrMartin);
      bookCollection.addBook(georgeRrMartin, aGameOfThrones);
      bookCollection.addBook(georgeRrMartin, aClashOfKings);
   }

   @Test
   void testAddAuthor() {
      assertThrows(DuplicateKeyException.class, () -> bookCollection.addAuthor(stephenKing));
   }

   @Test
   void testAddBook() {
      bookCollection.addBook(stephenKing, it);
      bookCollection.addBook(stephenKing, misery);
      List<Book> booksFromStephenKing = bookCollection.collection().get(stephenKing);
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
      assertEquals(Optional.of(georgeRrMartin), bookCollection.getMostDiligentAuthor());
   }

   @Test
   void testGetMostDiligentAuthor2() {
      bookCollection = new BookCollection(new HashMap<>());
      assertEquals(Optional.empty(), bookCollection.getMostDiligentAuthor());
   }

}
