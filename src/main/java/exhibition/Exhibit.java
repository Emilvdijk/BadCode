package exhibition;

/**
 * This abstract class represents an exhibit in an exhibition.
 */
public abstract class Exhibit {
  // The name of the exhibit
  protected String name;

  // The creator of the exhibit
  protected String creator;

  /**
   * Constructs a new Exhibit with the given name and creator.
   *
   * @param name the name of the exhibit
   * @param creator the creator of the exhibit
   */
  Exhibit(String name, String creator) {
    this.name = name;
    this.creator = creator;
  }

  /**
   * @return a description of the exhibit
   */
  public abstract String getDescription();
}