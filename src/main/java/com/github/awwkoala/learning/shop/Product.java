package com.github.awwkoala.learning.shop;

import lombok.Getter;

@Getter
public class Product {
  private String name;
  private double price;

  public Product(String name, double price) {
    if (price < 0) {
      throw new IllegalArgumentException("Price can't be lower than 0");
    }
    this.name = name;
    this.price = price;
  }

}
