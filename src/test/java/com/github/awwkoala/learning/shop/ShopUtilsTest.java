package com.github.awwkoala.learning.shop;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class ShopUtilsTest {
  private static final double NUM = 8.945021;

  @Test
  public void testRoundPrice() {
    ShopUtils util = new ShopUtils();
    double expectedResult = 8.95;
    double actualResult = util.roundPrice(NUM);
    Assertions.assertThat(actualResult)
      .describedAs("number is rounded correctly")
      .isEqualTo(expectedResult);
  }
}
