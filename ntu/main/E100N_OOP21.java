package ntu.main;

import ntu.model.Author;
import ntu.model.BookWithAuthor;

/**
 * Aufgabe OOP 2.1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E100N_OOP21 {

  public static void main(String[] args) {

    Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
    System.out.println(ahTeck);

    BookWithAuthor dummyBook = new BookWithAuthor("Java for dummy", ahTeck, 19.95, 99);
    System.out.println(dummyBook);

    dummyBook.setPrice(29.95);
    dummyBook.setQty(28);
    System.out.println("name is: " + dummyBook.getName());
    System.out.println("price is: " + dummyBook.getPrice());
    System.out.println("qty is: " + dummyBook.getQty());
    System.out.println("Author is: " + dummyBook.getAuthor());
    System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
    System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

    BookWithAuthor anotherBook =
        new BookWithAuthor("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
    System.out.println(anotherBook);

    System.out.println(anotherBook.getAuthorName());

  }

}
