package com.github.awwkoala.learning.shop;

import lombok.Getter;

public class Cart {
  /*  Zdefiniuj klasę Cart (koszyk), która będzie reprezentowała koszyk zakupowy.
    Powinna się w niej znajdować tablica, do której można dodawać produkty.
    Maksymalna liczba produktów w koszyku to 10.
    Dodawanie produktów do koszyka powinno być realizowane przy pomocy metody add(), którą należy zdefiniować.
    Produkty są reprezentowane jako obiekty typu Product i posiadają nazwę oraz cenę.
    W klasie Cart dodaj też metodę totalCost(), która zwraca sumę cen wszystkich produktów dodanych do koszyka.
    W programie nie możesz wykorzystywać pętli. W ramach programu możesz definiować dowolne metody
      (zwykłe lub rekurencyjne), które uznasz za pomocne. W wymienionych klasach możesz także definiować dodatkowe pola.*/
  @Getter
  private Product[] productCart = new Product[10];
  private ShopUtils util = new ShopUtils();
  private double productsCost = 0;
  private int cartSize = 0;

  public void add(Product product) {
    if (productCart.length > 10) {
      throw new ArrayIndexOutOfBoundsException("You cannot have more than 10 products in the cart");
    }
    productCart[cartSize] = product;
    productsCost += product.getPrice();
    cartSize++;
  }

  public double totalCost() {
    return util.roundPrice(productsCost);
  }

}
