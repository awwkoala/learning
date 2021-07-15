package com.github.awwkoala.learning.paycheck;

import lombok.Getter;

@Getter
public class PartTime extends Employee {

  private double hourlySalary;
  private int workingHours;

  public PartTime(String name, String surname, String job, int workingHours, double hourlySalary) {
    super(name, surname, job);
    if (hourlySalary < 18.3) {
      throw new IllegalArgumentException("Hourly salary cannot be less than minimum wage");
    }
    this.workingHours = workingHours;
    this.hourlySalary = hourlySalary;
  }

  public double monthlySalary() {
    return workingHours * hourlySalary;
  }

  @Override
  public String getType() {
    return "Part Time";
  }

  @Override
  public double getAnnualCost() {
    return monthlySalary() * 12;
  }

  @Override
  public String toString() {
    return String.format(
      "Employee's working hours: %d" +
        "\nEmployee's hourly salary: %s",
      workingHours, hourlySalary);
  }

}
