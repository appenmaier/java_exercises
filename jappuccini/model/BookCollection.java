package jappuccini.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Buechersammlung
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public record BookCollection(HashMap<Author, List<Book>> collection) {

  public void addAuthor(Author author) throws DuplicateKeyException {
    if (collection.containsKey(author)) {
      throw new DuplicateKeyException();
    }

    collection.put(author, new ArrayList<>());
  }

  public void addBook(Author author, Book book) {
    collection.get(author).add(book);
  }

  public Optional<Book> getBookByTitle(String title) {
    for (List<Book> books : collection.values()) {
      for (Book b : books) {
        if (b.title().equals(title)) {
          return Optional.of(b);
        }
      }
    }
    return Optional.empty();
  }
  /*
   * version 1.0: public Book getBookByTitle(String title) { for (List<Book> books :
   * collection.values()) { for (Book b : books) { if (b.title().equals(title)) { return b; } } }
   * return null; }
   */

  public Optional<Author> getMostDiligentAuthor() {
    Author mostDiligentAuthor = null;
    int mostBooks = 0;
    for (Entry<Author, List<Book>> entry : collection.entrySet()) {
      if (entry.getValue().size() > mostBooks) {
        mostDiligentAuthor = entry.getKey();
        mostBooks = entry.getValue().size();
      }
    }
    return Optional.ofNullable(mostDiligentAuthor);
  }
  /*
   * version 1.0: public Author getMostDiligentAuthor() { Author mostDiligentAuthor = null; int
   * mostBooks = 0; for (Entry<Author, List<Book>> entry : collection.entrySet()) { if
   * (entry.getValue().size() > mostBooks) { mostDiligentAuthor = entry.getKey(); mostBooks =
   * entry.getValue().size(); } } return mostDiligentAuthor; }
   */

}
