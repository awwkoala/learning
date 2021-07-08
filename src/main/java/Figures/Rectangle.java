package Figures;

public class Rectangle implements Figure {
  private final double a;
  private final double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public double getPerimeter() {
    double perimeter = 2 * a + 2 * b;
    return perimeter;
  }

  @Override
  public double getArea() {
    double area = a * b;
    return area;
  }

}
