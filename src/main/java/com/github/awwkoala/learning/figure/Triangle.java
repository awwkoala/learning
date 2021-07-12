package com.github.awwkoala.learning.figure;

public class Triangle implements Figure {
  //I assume it will always be a right triangle.
  private final double a;
  private final double b;

  public Triangle(double a, double b) {
    if (a<=0 || b<=0) {
      throw new IllegalArgumentException("Triangle's legs have to be more than 0.");
    }
    this.a = a;
    this.b = b;
  }

  @Override
  public double getPerimeter() {
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    return a + b + c;
  }

  @Override
  public double getArea() {
    return (a * b) / 2;
  }

}
