package exhibition;

/**
 * This class represents a modern painting. It extends the Painting class and adds a style attribute.
 */
public class ModernPainting extends Painting {
  // The style of the modern painting
  private final String style;

  /**
   * Constructs a new ModernPainting with the given name, creator, insurance value, and style.
   *
   * @param name the name of the painting
   * @param creator the creator of the painting
   * @param insuranceValue the insurance value of the painting
   * @param style the style of the painting
   */
  public ModernPainting(String name, String creator, double insuranceValue, String style) {
    super(name, creator, insuranceValue);
    this.style = style;
  }

  /**
   * Returns the style of the modern painting.
   *
   * @return the style of the painting
   */
  public String getStyle() {
    return style;
  }

  /**
   * Returns a description of the modern painting, including its name, creator, and style.
   *
   * @return a description of the painting
   */
  @Override
  public String getDescription() {
    return super.getDescription() + ", in the style of " + style;
  }
}