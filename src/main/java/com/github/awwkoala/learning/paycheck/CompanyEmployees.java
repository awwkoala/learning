package com.github.awwkoala.learning.paycheck;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CompanyEmployees {
  List<Employee> employeeList = new ArrayList<Employee>();

  public void printEmployees() {
    for (int i = 0; i < employeeList.size(); i++) {
      System.out.printf("Employee's name: %s %s ", employeeList.get(i).getName(), employeeList.get(i).getSurname());
      System.out.println("\nEmployee's job: " + employeeList.get(i).getJob());
      if (employeeList.get(i) instanceof FullTime) {
        System.out.println("Employee's type: Full Time");
        System.out.println("Employee's monthly salary: " + ((FullTime) employeeList.get(i)).getMonthlySalary());
      } else if (employeeList.get(i) instanceof PartTime) {
        System.out.println("Employee's type: Part Time");
        System.out.println("Employee's working hours: " + ((PartTime) employeeList.get(i)).getWorkingHours());
        System.out.println("Employee's hourly salary: " + ((PartTime) employeeList.get(i)).getHourlySalary());
      }
    }
  }

  public double employeesAnnualCost() {
    double annualCost = 0;
    for (int i = 0; i < employeeList.size(); i++) {
      if (employeeList.get(i) instanceof FullTime) {
        annualCost += 12 * ((FullTime) employeeList.get(i)).getMonthlySalary();
        annualCost += ((FullTime) employeeList.get(i)).bonus();
      } else if (employeeList.get(i) instanceof PartTime) {
        annualCost += 12 * ((PartTime) employeeList.get(i)).monthlySalary();
      }
    }
    return annualCost;
  }
}
