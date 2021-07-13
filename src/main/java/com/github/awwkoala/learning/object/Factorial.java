package com.github.awwkoala.learning.object;

public class Factorial {
  //  Napisz metodę, która obliczy silnię liczby naturalnej, podanej jako argument. Metoda powinna być rekurencyjna.
  public double factorial(double a) {
    double result;
    if (a < 0) {
      throw new IllegalArgumentException("The number cannot be less than 0.");
    } else if (a <= 1) {
      return result = 1;
    }
    result = a * factorial(a - 1);
    return result;
  }
}
