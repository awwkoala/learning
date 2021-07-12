package com.github.awwkoala.learning.figure;

public class Rectangle implements Figure {
  private final double a;
  private final double b;

  public Rectangle(double a, double b) {
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
