package Figures;

public class Triangle implements Figure {
  //I assume it will always be a right triangle.
  private final double a;
  private final double b;

  public Triangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public double getPerimeter() {
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    double perimeter = a + b + c;
    return perimeter;
  }

  @Override
  public double getArea() {
    double area = (a * b) / 2;
    return area;
  }

}
