package com.github.awwkoala.learning.paycheck;

import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompanyEmployeesTest {
  private static final double MONTHLY_SALARY = 30000;
  private static final double HOURLY_SALARY = 25;
  private static final int WORKING_HOURS = 120;
  private CompanyEmployees comEmp;
  private FullTime emp1;
  private PartTime emp2;

  @BeforeMethod
  public void beforeMethod() {
    comEmp = new CompanyEmployees();
    emp1 = new FullTime("name1", "surname1", "job1", MONTHLY_SALARY);
    emp2 = new PartTime("name2", "surname2", "job2", WORKING_HOURS, HOURLY_SALARY);
  }

  @Test
  public void testEmployeesAnnualCost() {
    comEmp.getEmployeeList().add(emp1);
    comEmp.getEmployeeList().add(emp2);
    double expectedResult = 414000;
    double actualResult = comEmp.employeesAnnualCost();
    Assertions.assertThat(actualResult)
      .describedAs("the annual cost of all employees' salaries is calculated correctly")
      .isEqualTo(expectedResult);
  }

}
