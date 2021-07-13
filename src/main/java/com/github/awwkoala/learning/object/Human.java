package com.github.awwkoala.learning.object;

public class Human {
  //  Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć.
//  Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale.
  private int age;
  private int weight;
  private int height;
  private String name;
  private boolean male;

  public Human(int age, int weight, int height, String name, boolean male) {
    if (age < 0 || weight <= 0 || height <= 0) {
      throw new IllegalArgumentException("Numeric attributes cannot be less than or equal to 0.");
    }
    this.age = age;
    this.weight = weight;
    this.height = height;
    this.name = name;
    this.male = male;
  }

  public int getAge() {
    return age;
  }

  public int getWeight() {
    return weight;
  }

  public int getHeight() {
    return height;
  }

  public String getName() {
    return name;
  }

  public boolean isMale() {
    return male;
  }

}
