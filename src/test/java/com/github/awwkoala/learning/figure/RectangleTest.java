package com.github.awwkoala.learning.figure;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class RectangleTest {
  private double a = 2;
  private double b = 3;
  private double c = 0;
  private double d = -2;
  private Rectangle rectanglePos = new Rectangle(a, b);

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleBothZero() {
    new Rectangle(c, c);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleOneZeroOnePos() {
    new Rectangle(c, a);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleOneZeroOneNeg() {
    new Rectangle(c, d);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleBothNeg() {
    new Rectangle(d, d);
  }

  @Test
  public void testGetPerimeter() {
    double expectedResult = 10;
    double actualResult = rectanglePos.getPerimeter();
    Assertions.assertThat(actualResult)
      .describedAs("perimeter of rectangle with positive sides length is calculated")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testGetArea() {
    double expectedResult = 6;
    double actualResult = rectanglePos.getArea();
    Assertions.assertThat(actualResult)
      .describedAs("area of rectangle with positive sides length is calculated")
      .isEqualTo(expectedResult);
  }

}
