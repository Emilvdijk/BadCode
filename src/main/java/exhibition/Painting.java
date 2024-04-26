package exhibition;

/**
 * This class represents a painting as an exhibit.
 */
public class Painting extends Exhibit implements Insurable {
  // The insurance value of the painting
  private final double insuranceValue;

  /**
   * Constructs a new Painting with the given name, creator, and insurance value.
   *
   * @param name the name of the painting
   * @param creator the creator of the painting
   * @param insuranceValue the insurance value of the painting
   */
  public Painting(String name, String creator, double insuranceValue) {
    super(name, creator);
    this.insuranceValue = insuranceValue;
  }

  /**
   * Returns a description of the painting, including its name and creator.
   *
   * @return a description of the painting
   */
  @Override
  public String getDescription() {
    return "A painting named " + name + " by " + creator;
  }

  /**
   * Returns the insurance value of the painting.
   *
   * @return the insurance value of the painting
   */
  @Override
  public double getInsuranceValue() {
    return insuranceValue;
  }
}