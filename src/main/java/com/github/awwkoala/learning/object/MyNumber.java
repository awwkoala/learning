package com.github.awwkoala.learning.object;

public class MyNumber {
  //  Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
//  MyNumber isOdd() – true jeśli atrybut jest nieparzysty,
//  MyNumber isEven() – true jeśli atrybut jest parzysty,
//  MyNumber sqrt() – pierwiastek z atrybutu,
//  MyNumber pow(MyNumber x) – atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
//  MyNumber add(MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
//  MyNumber subtract(MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
  private double a;

  public double getA() {
    return a;
  }

  public MyNumber(double a) {
    this.a = a;
  }

  public boolean isOdd() {
    return a % 2 != 0;
  }

  public boolean isEven() {
    return a % 2 == 0;
  }

  public double sqrt() {
    return Math.sqrt(a);
  }

  public double pow(MyNumber x) {
    return Math.pow(a, x.a);
  }

  public MyNumber add(MyNumber x) {
    return new MyNumber(a + x.a);
  }

  public MyNumber subtract(MyNumber x) {
    return new MyNumber(a - x.a);
  }

}
