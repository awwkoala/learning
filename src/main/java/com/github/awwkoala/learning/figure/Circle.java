package com.github.awwkoala.learning.figure;

public class Circle implements Figure {
  private final double r;

  public Circle(double r) {
    if (r<=0) {
      throw new IllegalArgumentException("The radius have to be more than 0.");
    }
    this.r = r;
  }

  @Override
  public double getPerimeter() {
    return 6.28 * r;
  }

  @Override
  public double getArea() {
    return 3.14 * Math.pow(r, 2);
  }

}
