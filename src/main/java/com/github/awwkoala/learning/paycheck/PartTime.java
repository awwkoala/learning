package com.github.awwkoala.learning.paycheck;

import lombok.Getter;

@Getter
public class PartTime extends Employee {
  private double hourlySalary;
  private int workingHours;

  public PartTime(String name, String surname, String job, int workingHours, double hourlySalary) {
    super(name, surname, job);
    this.workingHours = workingHours;
    this.hourlySalary = hourlySalary;
    if (hourlySalary < 18.3) {
      throw new IllegalArgumentException("Hourly salary cannot be less than minimum wage");
    }
  }

  public double monthlySalary() {
    return workingHours * hourlySalary;
  }

}
