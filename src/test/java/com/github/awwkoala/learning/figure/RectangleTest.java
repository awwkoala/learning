package com.github.awwkoala.learning.figure;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class RectangleTest {

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleBothZero() {
    new Rectangle(0, 0);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleOneZeroOnePos() {
    new Rectangle(0, 2);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleOneZeroOneNeg() {
    new Rectangle(0, -2);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleBothNeg() {
    new Rectangle(-2, -2);
  }

  @Test
  public void testGetPerimeter() {
    Rectangle rectanglePos = new Rectangle(2, 3);
    double expectedResult = 10;
    double actualResult = rectanglePos.getPerimeter();
    Assertions.assertThat(actualResult)
      .describedAs("perimeter of rectangle with positive sides length is calculated")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testGetArea() {
    Rectangle rectanglePos = new Rectangle(2, 3);
    double expectedResult = 6;
    double actualResult = rectanglePos.getArea();
    Assertions.assertThat(actualResult)
      .describedAs("area of rectangle with positive sides length is calculated")
      .isEqualTo(expectedResult);
  }

}
