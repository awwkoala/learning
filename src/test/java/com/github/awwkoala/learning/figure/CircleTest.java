package com.github.awwkoala.learning.figure;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class CircleTest {

  private double a = 3;
  private double b = 0;
  private double c = -3;
  private Circle circlePos = new Circle(a);

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testCircleZero() {
    new Circle(b);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testCircleNeg() {
    new Circle(c);
  }

  @Test
  public void testGetPerimeter() {
    double expectedResult = 18.84955592153876;
    double actualResult = circlePos.getPerimeter();
    Assertions.assertThat(actualResult)
      .describedAs("perimeter of circle with positive radius length is calculated")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testGetArea() {
    double expectedResult = 28.274333882308138;
    double actualResult = circlePos.getArea();
    Assertions.assertThat(actualResult)
      .describedAs("area of circle with positive radius length is calculated")
      .isEqualTo(expectedResult);
  }

}
