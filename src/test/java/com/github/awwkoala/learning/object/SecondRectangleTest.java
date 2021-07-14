package com.github.awwkoala.learning.object;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class SecondRectangleTest {
  private static final double NUM_A = 2;
  private static final double NUM_B = 3;

  @Test
  public void testCalculateDiagonalPos() {
    SecondRectangle rectanglePos = new SecondRectangle(NUM_A, NUM_B);
    double expectedResult = 3.605551275463989;
    double actualResult = rectanglePos.calculateDiagonal();
    Assertions.assertThat(actualResult)
      .describedAs("diagonal of rectangle with positive sides length is calculated")
      .isEqualTo(expectedResult);
  }

}
