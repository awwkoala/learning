package com.github.awwkoala.learning.shop;

public class ShopUtils {

  public double roundPrice(double price) {
    return Math.round(price * 100.0) / 100.0;
  }

}
