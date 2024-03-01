package ntu.main;

import ntu.model.BookWithAuthors;
import ntu.model.Author;

/**
 * Aufgabe OOP 2.2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E110N_OOP22 {

  public static void main(String[] args) {

    Author[] authors = new Author[2];
    authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
    authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

    BookWithAuthors javaDummy = new BookWithAuthors("Java for Dummy", authors, 19.99, 99);
    System.out.println(javaDummy);

  }

}
