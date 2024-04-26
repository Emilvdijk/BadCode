package librarysystem;

import java.time.LocalDate;

/**
 * This class represents a book in the library system.
 */
public class Book extends LibraryItem {

  // The author of the book
  private static String author;

  /**
   * Constructs a new Book with the given title, author, and publication date.
   *
   * @param newTitle the title of the book
   * @param newAuthor the author of the book
   * @param newPublicationDate the publication date of the book
   */
  protected Book(String newTitle, String newAuthor, LocalDate newPublicationDate) {
    super(newTitle, newPublicationDate);
    author = newAuthor;
  }

  /**
   * Returns the overview item text for the book, including its title and author.
   *
   * @return the overview item text for the book
   */
  public static String getOverviewItemText(){
    return LibraryItem.getOverviewItemText() + " by " + author;
  }

}