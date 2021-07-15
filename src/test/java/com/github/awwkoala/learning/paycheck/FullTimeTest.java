package com.github.awwkoala.learning.paycheck;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class FullTimeTest {

  private static final double POS_SALARY = 8500;
  private static final double NOT_MIN_SALARY = 2799;
  private static final double MIN_SALARY = 2800;
  private static final double NEG_SALARY = -5000;
  private static final double ZERO_SALARY = 0;

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testFullTimeSalaryNotMin() {
    new FullTime("Name", "Surname", "job", NOT_MIN_SALARY);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testFullTimeSalaryNeg() {
    new FullTime("Name", "Surname", "job", NEG_SALARY);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testFullTimeSalaryZero() {
    new FullTime("Name", "Surname", "job", ZERO_SALARY);
  }

  @Test
  public void testFullTimeSalaryMin() {
    FullTime emp1 = new FullTime("Name", "Surname", "job", MIN_SALARY);
    double expectedResult = 2800;

    double actualResult = emp1.getMonthlySalary();

    Assertions.assertThat(actualResult)
      .describedAs("employee with minimum monthly salary is created")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testBonus() {
    FullTime emp1 = new FullTime("Name", "Surname", "job", POS_SALARY);
    double expectedResult = 5100;

    double actualResult = emp1.bonus();

    Assertions.assertThat(actualResult)
      .describedAs("yearly bonus is calculated correctly")
      .isEqualTo(expectedResult);
  }

}
