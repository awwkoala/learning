package com.github.awwkoala.learning.figure;

public class Rectangle implements Figure {
  private final double a;
  private final double b;

  public Rectangle(double a, double b) {
    if (a <= 0 || b <= 0) {
      throw new IllegalArgumentException("Rectangle's sides have to be more than 0.");
    }
    this.a = a;
    this.b = b;
  }

  @Override
  public double getPerimeter() {
    return 2 * a + 2 * b;
  }

  @Override
  public double getArea() {
    return a * b;
  }

}
