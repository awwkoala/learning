package com.github.awwkoala.learning.figure;

public class Circle implements Figure {
  private final double r;

  public Circle(double r) {
    if (r <= 0) {
      throw new IllegalArgumentException("The radius have to be more than 0.");
    }
    this.r = r;
  }

  @Override
  public double getPerimeter() {
    return Math.PI * 2 * r;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(r, 2);
  }

}
