package shapes;

/**
 * This class represents a Circle.
 */
public class Circle implements Shape {

  // The radius of the circle
  private final double radius;

  /**
   * Constructs a new Circle with the given radius.
   *
   * @param radius the radius of the circle
   */
  public Circle(double radius){
    this.radius = radius;
  }

  /**
   * Returns the area of the circle.
   *
   * @return the area of the circle
   */
  @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /**
   * Returns the perimeter of the circle.
   *
   * @return the perimeter of the circle
   */
  @Override
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
}