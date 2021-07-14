package com.github.awwkoala.learning.paycheck;

import lombok.Getter;

@Getter
public class FullTime extends Employee {
  private double monthlySalary;

  public FullTime(String name, String surname, String job, double monthlySalary) {
    super(name, surname, job);
    this.monthlySalary = monthlySalary;
    if (monthlySalary < 2800) {
      throw new IllegalArgumentException("Monthly salary cannot be less than minimum wage");
    }
  }

  public double bonus() {
    return monthlySalary * 12 * 0.05;
  }

}
