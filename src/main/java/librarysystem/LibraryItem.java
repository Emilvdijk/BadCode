package librarysystem;

import java.time.LocalDate;

/**
 * This abstract class represents a library item.
 */
public abstract class LibraryItem {

  // The title of the library item
  private static String title;

  // The publication date of the library item
  private static LocalDate publicationDate;

  /**
   * Constructs a new LibraryItem with the given title and publication date.
   *
   * @param newTitle the title of the library item
   * @param newPublicationDate the publication date of the library item
   */
  protected LibraryItem(String newTitle, LocalDate newPublicationDate) {
    title = newTitle;
    publicationDate = newPublicationDate;
  }

  /**
   * Returns the overview item text for the library item, including its title and publication date.
   *
   * @return the overview item text for the library item
   */
  public static String getOverviewItemText(){
    return title + " (" + publicationDate + ")";
  }

}