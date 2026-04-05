package com.payroll.main;
import com.payroll.model.*;
import com.payroll.service.*;
import com.payroll.util.*;

public class MainApp{
  public static void main(String[] args) {
    Payroll pr = new Payroll();
    PayrollService ps = new PayrollService(pr);
    Employee e1 = new FullTimeEmployee(117, "Deepthi",75000, 0, 1000);
    Employee e2 = new PartTimeEmployee(101,"Anu",0,12,500);
    pr.addEmployee(e1);
    pr.addEmployee(e2);
    ps.processPayroll();
    double total = ps.calculateTotalSalary();
    System.out.println("Total Salary: " + total);
    ps.generateAllPayslips();
  }
}