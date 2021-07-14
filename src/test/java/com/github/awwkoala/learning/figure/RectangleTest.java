package com.github.awwkoala.learning.figure;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class RectangleTest {
  private static final double POS_NUM1 = 2;
  private static final double POS_NUM2 = 3;
  private static final double ZERO_NUM = 0;
  private static final double NEG_NUM = -2;

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleBothZero() {
    new Rectangle(ZERO_NUM, ZERO_NUM);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleOneZeroOnePos() {
    new Rectangle(ZERO_NUM, POS_NUM1);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleOneZeroOneNeg() {
    new Rectangle(ZERO_NUM, NEG_NUM);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testRectangleBothNeg() {
    new Rectangle(NEG_NUM, NEG_NUM);
  }

  @Test
  public void testGetPerimeter() {
    Rectangle rectanglePos = new Rectangle(POS_NUM1, POS_NUM2);
    double expectedResult = 10;
    double actualResult = rectanglePos.getPerimeter();
    Assertions.assertThat(actualResult)
      .describedAs("perimeter of rectangle with positive sides length is calculated")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testGetArea() {
    Rectangle rectanglePos = new Rectangle(POS_NUM1, POS_NUM2);
    double expectedResult = 6;
    double actualResult = rectanglePos.getArea();
    Assertions.assertThat(actualResult)
      .describedAs("area of rectangle with positive sides length is calculated")
      .isEqualTo(expectedResult);
  }

}
