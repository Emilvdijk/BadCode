package shapes;

/**
 * This class represents a Triangle.
 */
public class Triangle implements Shape {

  // The length of side B of the triangle
  private final double sideB;

  // The length of side A of the triangle
  private final double sideA;

  // The length of side C of the triangle
  private final double sideC;

  /**
   * Constructs a new Triangle with the given lengths for sides A, B, and C.
   *
   * @param sideB the length of side B of the triangle
   * @param sideA the length of side A of the triangle
   * @param sideC the length of side C of the triangle
   */
  public Triangle(double sideB, double sideA, double sideC) {
    this.sideB = sideB;
    this.sideA = sideA;
    this.sideC = sideC;
  }

  /**
   * Returns the area of the triangle. The area is calculated using the formula (sideB * sideA) / 2.
   *
   * @return the area of the triangle
   */
  @Override
  public double getArea() {
    return sideB * sideA / 2;
  }

  /**
   * Returns the perimeter of the triangle. The perimeter is calculated by adding the lengths of sides A, B, and C.
   *
   * @return the perimeter of the triangle
   */
  @Override
  public double getPerimeter() {
    return sideB + sideA + sideC;
  }
}