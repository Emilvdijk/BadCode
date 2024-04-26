package shapes;

/**
 * This interface represents a Shape. It provides methods for getting the area and the perimeter of the shape.
 * It also provides a static method for getting the area of a specific shape.
 */
public interface Shape {

  /**
   * Returns the area of the shape.
   *
   * @return the area of the shape
   */
  double getArea();

  /**
   * Returns the perimeter of the shape.
   *
   * @return the perimeter of the shape
   */
  double getPerimeter();

  /**
   * Returns the area of a specific shape. If the shape is a Triangle, Square, or Circle, it returns the area of the shape.
   * If the shape is not a Triangle, Square, or Circle, it returns 0.
   *
   * @param shape the shape to get the area of
   * @return the area of the shape, or 0 if the shape is not a Triangle, Square, or Circle
   */
  static double getAreaOfShape(Shape shape){
    if(shape instanceof Triangle){
      return ((Triangle) shape).getArea();
    }
    if(shape instanceof Square){
      return ((Square) shape).getArea();
    }
    if(shape instanceof Circle){
      return ((Circle) shape).getArea();
    }
    return 0;
  }
}