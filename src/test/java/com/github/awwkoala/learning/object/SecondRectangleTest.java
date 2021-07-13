package com.github.awwkoala.learning.object;

import com.github.awwkoala.learning.figure.Rectangle;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class SecondRectangleTest {
  private double a = 2;
  private double b = 3;
  private SecondRectangle rectanglePos = new SecondRectangle(a, b);

  @Test
  public void testCalculateDiagonalPos() {
    double expectedResult = 3.605551275463989;
    double actualResult = rectanglePos.calculateDiagonal();
    Assertions.assertThat(actualResult)
      .describedAs("diagonal of rectangle with positive sides length is calculated")
      .isEqualTo(expectedResult);
  }

}
