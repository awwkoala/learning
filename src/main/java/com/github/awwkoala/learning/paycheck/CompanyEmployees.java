package com.github.awwkoala.learning.paycheck;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CompanyEmployees {

  List<Employee> employeeList = new ArrayList<>();

  public void printEmployees() {
    for (Employee employee : employeeList) {
      System.out.printf("Employee's name: %s %s %n", employee.getName(), employee.getSurname());
      System.out.println("Employee's job: " + employee.getJob());
      if (employee.getType().equals("Full Time")) {
        System.out.println("Employee's type: " + employee.getType());
        System.out.println(employee);
      } else if (employee.getType().equals("Part Time")) {
        System.out.println("Employee's type: " + employee.getType());
        System.out.println(employee);
      }
    }
  }

  public double employeesAnnualCost() {
    double annualCost = 0;
    for (Employee employee : employeeList) {
      if (employee.getType().equals("Full Time")) {
        annualCost += employee.getAnnualCost();
      } else if (employee.getType().equals("Part Time")) {
        annualCost += employee.getAnnualCost();
      }
    }
    return annualCost;
  }

}
