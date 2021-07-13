package com.github.awwkoala.learning.figure;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class CircleTest {

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testCircleZero() {
    new Circle(0);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testCircleNeg() {
    new Circle(-3);
  }

  @Test
  public void testGetPerimeter() {
    Circle circlePos = new Circle(3);
    double expectedResult = 18.84955592153876;
    double actualResult = circlePos.getPerimeter();
    Assertions.assertThat(actualResult)
      .describedAs("perimeter of circle with positive radius length is calculated")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testGetArea() {
    Circle circlePos = new Circle(3);
    double expectedResult = 28.274333882308138;
    double actualResult = circlePos.getArea();
    Assertions.assertThat(actualResult)
      .describedAs("area of circle with positive radius length is calculated")
      .isEqualTo(expectedResult);
  }

}
