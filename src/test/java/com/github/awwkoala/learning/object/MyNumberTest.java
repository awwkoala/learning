package com.github.awwkoala.learning.object;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class MyNumberTest {
  private double oddNum = 3;
  private double evenNum = 4;
  private double zero = 0;
  private MyNumber myNumOdd = new MyNumber(oddNum);
  private MyNumber myNumEven = new MyNumber(evenNum);

  @Test
  public void testIsOddOdd() {
    boolean result = myNumOdd.isOdd();
    Assertions.assertThat(result).describedAs("the odd number is odd").isTrue();
  }

  @Test
  public void testIsOddEven() {
    boolean result = myNumEven.isOdd();
    Assertions.assertThat(result).describedAs("the even number is not odd").isFalse();
  }

  @Test
  public void testIsEvenEven() {
    boolean result = myNumEven.isEven();
    Assertions.assertThat(result).describedAs("the even number is even").isTrue();
  }

  @Test
  public void testIsEvenOdd() {
    boolean result = myNumOdd.isEven();
    Assertions.assertThat(result).describedAs("the odd number is not even").isFalse();
  }

  @Test
  public void testSqrt() {
    double expectedResult = 2;
    double actualResult = myNumEven.sqrt();
    Assertions.assertThat(actualResult).describedAs("the number is correctly rooted")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testPow() {
    double expectedResult = 64;
    double actualResult = myNumEven.pow(myNumOdd);
    Assertions.assertThat(actualResult).describedAs("the number is correctly squared")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testAdd() {
    MyNumber expectedResult = new MyNumber(7);
    MyNumber actualResult = myNumEven.add(myNumOdd);
    Assertions.assertThat(actualResult.getA()).describedAs("the numbers are added correctly")
      .isEqualTo(expectedResult.getA());
  }

  @Test
  public void testSubtract() {
    MyNumber expectedResult = new MyNumber(1);
    MyNumber actualResult = myNumEven.subtract(myNumOdd);
    Assertions.assertThat(actualResult.getA()).describedAs("the numbers are subtracted correctly")
      .isEqualTo(expectedResult.getA());
  }

}
