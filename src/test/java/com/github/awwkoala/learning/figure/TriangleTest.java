package com.github.awwkoala.learning.figure;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleTest {

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleBothZero() {
    new Rectangle(0, 0);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleOneZeroOnePos() {
    new Rectangle(0, 2);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleOneZeroOneNeg() {
    new Rectangle(0, -2);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleBothNeg() {
    new Rectangle(-2, -2);
  }

  @Test
  public void testGetPerimeter() {
    Triangle trianglePos = new Triangle(2,3);
    double expectedResult = 8.60555127546399;
    double actualResult = trianglePos.getPerimeter();
    Assertions.assertThat(actualResult)
      .describedAs("perimeter of triangle with positive legs length is calculated")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testGetArea() {
    Triangle trianglePos = new Triangle(2,3);
    double expectedResult = 3;
    double actualResult = trianglePos.getArea();
    Assertions.assertThat(actualResult)
      .describedAs("area of triangle with positive legs length is calculated")
      .isEqualTo(expectedResult);
  }
}
