package com.github.awwkoala.learning.figure;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleTest {
  private static final double POS_NUM1 = 2;
  private static final double POS_NUM2 = 3;
  private static final double ZERO_NUM = 0;
  private static final double NEG_NUM = -2;

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleBothZero() {
    new Rectangle(ZERO_NUM, ZERO_NUM);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleOneZeroOnePos() {
    new Rectangle(ZERO_NUM, POS_NUM1);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleOneZeroOneNeg() {
    new Rectangle(ZERO_NUM, NEG_NUM);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTriangleBothNeg() {
    new Rectangle(NEG_NUM, NEG_NUM);
  }

  @Test
  public void testGetPerimeter() {
    Triangle trianglePos = new Triangle(POS_NUM1,POS_NUM2);
    double expectedResult = 8.60555127546399;
    double actualResult = trianglePos.getPerimeter();
    Assertions.assertThat(actualResult)
      .describedAs("perimeter of triangle with positive legs length is calculated")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testGetArea() {
    Triangle trianglePos = new Triangle(POS_NUM1,POS_NUM2);
    double expectedResult = 3;
    double actualResult = trianglePos.getArea();
    Assertions.assertThat(actualResult)
      .describedAs("area of triangle with positive legs length is calculated")
      .isEqualTo(expectedResult);
  }
}
