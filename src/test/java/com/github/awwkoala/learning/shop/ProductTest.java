package com.github.awwkoala.learning.shop;

import org.testng.annotations.Test;

public class ProductTest {
  private static final double NEG_PRICE = -3;

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testProductPriceNeg() {
    new Product("prod1", NEG_PRICE);
  }

}
