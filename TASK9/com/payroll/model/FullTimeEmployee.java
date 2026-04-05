package com.payroll.model;

public class FullTimeEmployee extends Employee{
  private double bonus;
  private double allowance;

  public FullTimeEmployee(int empid, String name,double baseSalary,double bonus, double allowance){
    super(empid, name, baseSalary);
    this.bonus = bonus;
    this.allowance = allowance;
  }
  @Override
  public double calculateSalary(){
    return baseSalary + bonus + allowance;
  }
  @Override
  public void displayDetails(){
    System.out.println("----FULL TIME EMPLOYEE----");
    System.out.println("Employee ID: "+ getEmpid());
    System.out.println("Employee Name: "+getName());
    System.out.println("Employee BaseSalary: "+ baseSalary);
    System.out.println("Bonus: "+ bonus);
    System.out.println("Allowances: "+ allowance);
    System.out.println("Total Salary: "+ calculateSalary());
  }
}