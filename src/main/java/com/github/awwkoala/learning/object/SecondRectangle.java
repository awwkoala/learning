package com.github.awwkoala.learning.object;

import com.github.awwkoala.learning.figure.Rectangle;

public class SecondRectangle extends Rectangle {
  private double c;
//    Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość.
//    Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.

  public SecondRectangle(double a, double b) {
    super(a, b);
    c = Math.pow(a, 2) + Math.pow(b, 2);
  }

  public double calculateDiagonal() {
    return Math.sqrt(c);
  }

}
