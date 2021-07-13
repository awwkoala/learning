package com.github.awwkoala.learning.object;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class FactorialTest {
  private static final double POS_NUM = 5;
  private static final double ZERO_NUM = 0;
  private static final double NEG_NUM = -5;

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testFactorialNeg() {
    Factorial fac = new Factorial();
    fac.factorial(NEG_NUM);
  }

  @Test
  public void testFactorialZero() {
    Factorial fac = new Factorial();
    double expectedResult = 1;
    double actualResult = fac.factorial(ZERO_NUM);
    Assertions.assertThat(actualResult).describedAs("the factorial of 0 is 1").isEqualTo(expectedResult);
  }

  @Test
  public void testFactorialPos() {
    Factorial fac = new Factorial();
    double expectedResult = 120;
    double actualResult = fac.factorial(POS_NUM);
    Assertions.assertThat(actualResult).describedAs("the factorial of %f is %f", POS_NUM, expectedResult).isEqualTo(expectedResult);
  }

}
