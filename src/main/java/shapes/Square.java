package shapes;

/**
 * This class represents a Square.
 */
public class Square implements Shape {

  // The width of the square
  private final double width;

  // The height of the square
  private final double height;

  /**
   * Constructs a new Square with the given width and height.
   *
   * @param width the width of the square
   * @param height the height of the square
   */
  public Square(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the area of the square.
   *
   * @return the area of the square
   */
  @Override
  public double getArea() {
    return width * height;
  }

  /**
   * Returns the perimeter of the square.
   *
   * @return the perimeter of the square
   */
  @Override
  public double getPerimeter() {
    return width * 2 + height * 2;
  }
}