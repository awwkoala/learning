package com.github.awwkoala.learning.figure;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleTest {
  private double a = 2;
  private double b = 3;
  private double c = 0;
  private double d = -2;
  private Triangle trianglePos = new Triangle(a,b);

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleBothZero() {
    new Rectangle(c, c);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleOneZeroOnePos() {
    new Rectangle(c, a);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleOneZeroOneNeg() {
    new Rectangle(c, d);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleBothNeg() {
    new Rectangle(d, d);
  }

  @Test
  public void testGetPerimeter() {
    double expectedResult = 8.60555127546399;
    double actualResult = trianglePos.getPerimeter();
    Assertions.assertThat(actualResult)
      .describedAs("perimeter of triangle with positive legs length is calculated")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testGetArea() {
    double expectedResult = 3;
    double actualResult = trianglePos.getArea();
    Assertions.assertThat(actualResult)
      .describedAs("area of triangle with positive legs length is calculated")
      .isEqualTo(expectedResult);
  }
}
