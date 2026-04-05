//PayrollService.java
package com.payroll.service;

import com.payroll.model.*;
import com.payroll.util.TaxUtil;

public class PayrollService {
  private Payroll payroll;
  public PayrollService(Payroll payroll){
    this.payroll = payroll;
  }

  public double calculateTotalSalary(){
    double totalSalary=0;
    for(Employee e : payroll.getEmployees()){
      totalSalary += e.calculateSalary();
    }return totalSalary;
  }

  public void processPayroll() {
    if (payroll.getEmployees().isEmpty()) {
        System.out.println("No employees in payroll.");
        return;
    }

    for (Employee e : payroll.getEmployees()) {
        e.displayDetails();  // polymorphism
        double salary = e.calculateSalary();
        System.out.println("Calculated Salary: " + salary);
    }
     System.out.println("Total Payroll Salary: " + calculateTotalSalary());
  }

  public void generatePayslip(Employee e) {
    double grossSalary = e.calculateSalary();
    double tax = TaxUtil.calculateTax(grossSalary);
    double netSalary = grossSalary - tax;

    System.out.println("----PAYSLIP----");
    System.out.println("Employee ID: " + e.getEmpid());
    System.out.println("Employee Name: " + e.getName());
    System.out.println("Gross Salary: " + grossSalary);
    System.out.println("Tax Deduction: " + tax);
    System.out.println("Net Salary: " + netSalary);
  }

  public void generateAllPayslips() {
    if (payroll.getEmployees().isEmpty()) {
        System.out.println("No employees in payroll.");
        return;
    }
    for (Employee e : payroll.getEmployees()) {
        generatePayslip(e);
    }
  }
}
