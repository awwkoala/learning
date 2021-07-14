package com.github.awwkoala.learning.paycheck;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class PartTimeTest {
  private static final double MIN_HOUR_SAL = 18.3;
  private static final double NEG_HOUR_SAL = -10;
  private static final double ZERO_HOUR_SAL = 0;
  private static final double POS_HOUR_SAL = 80;
  private static final double NOT_MIN_HOUR_SAL = 18.29;

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testPartTimeNotMin() {
    new FullTime("Name", "Surname", "job", NOT_MIN_HOUR_SAL);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testPartTimeNeg() {
    new FullTime("Name", "Surname", "job", NEG_HOUR_SAL);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testPartTimeZero() {
    new FullTime("Name", "Surname", "job", ZERO_HOUR_SAL);
  }

  @Test
  public void testPartTimeSalaryMin() {
    PartTime emp1 = new PartTime("Name", "Surname", "job", 80, MIN_HOUR_SAL);
    double expectedResult = 18.3;
    double actualResult = emp1.getHourlySalary();
    Assertions.assertThat(actualResult)
      .describedAs("employee with minimum hourly salary is created")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testMonthlySalary() {
    PartTime emp1 = new PartTime("Name", "Surname", "job", 120, POS_HOUR_SAL);
    double expectedResult = 9600;
    double actualResult = emp1.monthlySalary();
    Assertions.assertThat(actualResult)
      .describedAs("monthly salary is calculated")
      .isEqualTo(expectedResult);
  }

}
