package Figures;

public class Circle implements Figure {
  private final double r;

  public Circle(double r) {
    this.r = r;
  }

  @Override
  public double getPerimeter() {
    double perimeter = 6.28 * r;
    return perimeter;
  }

  @Override
  public double getArea() {
    double area = 3.14 * Math.pow(r, 2);
    return area;
  }

}
