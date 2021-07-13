package com.github.awwkoala.learning.shop;

import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest {
  private static final double POS_PRICE1 = 5.99;
  private static final double POS_PRICE2 = 20.99;
  private Cart cart;
  private Product prod1;
  private Product prod2;

  @BeforeMethod
  public void beforeMethod() {
    cart = new Cart();
    prod1 = new Product("prod1", POS_PRICE1);
    prod2 = new Product("prod2", POS_PRICE2);
  }

  @Test(expectedExceptions = {ArrayIndexOutOfBoundsException.class})
  public void testAddTooMany() {
    cart.add(prod1);
    cart.add(prod1);
    cart.add(prod1);
    cart.add(prod1);
    cart.add(prod1);
    cart.add(prod1);
    cart.add(prod1);
    cart.add(prod1);
    cart.add(prod1);
    cart.add(prod1);
    cart.add(prod1);
  }

  @Test
  public void testAddOne() {
    Product[] expectedResult = new Product[10];
    expectedResult[0] = prod1;
    cart.add(prod1);
    Product[] actualResult = cart.getProductCart();
    Assertions.assertThat(actualResult)
      .describedAs("one product is added to cart array correctly")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testAddMultipleDiff() {
    Product[] expectedResult = new Product[10];
    expectedResult[0] = prod1;
    expectedResult[1] = prod2;
    cart.add(prod1);
    cart.add(prod2);
    Product[] actualResult = cart.getProductCart();
    Assertions.assertThat(actualResult)
      .describedAs("multiple different products are added to cart array correctly")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testAddMultipleSame() {
    Product[] expectedResult = new Product[10];
    expectedResult[0] = prod1;
    expectedResult[1] = prod1;
    cart.add(prod1);
    cart.add(prod1);
    Product[] actualResult = cart.getProductCart();
    Assertions.assertThat(actualResult)
      .describedAs("multiple same products are added to cart array correctly")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testTotalCost() {
    cart.add(prod1);
    cart.add(prod2);
    double expectedResult = 26.98;
    double actualResult = cart.totalCost();
    Assertions.assertThat(actualResult)
      .describedAs("total cost of the products in cart is calculated correctly")
      .isEqualTo(expectedResult);
  }

}
