package com.github.awwkoala.learning.object;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class FactorialTest {
  private double numPos = 5;
  private double numZero = 0;
  private double numNeg = -5;
  Factorial fac = new Factorial();

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testFactorialNeg() {
    fac.factorial(numNeg);
  }

  @Test
  public void testFactorialZero() {
    double expectedResult = 1;
    double actualResult = fac.factorial(numZero);
    Assertions.assertThat(actualResult).describedAs("the factorial of 0 is 1").isEqualTo(expectedResult);
  }

  @Test
  public void testFactorialPos() {
    double expectedResult = 120;
    double actualResult = fac.factorial(numPos);
    Assertions.assertThat(actualResult).describedAs("the factorial of %f is %f", numPos, expectedResult).isEqualTo(expectedResult);
  }

}
