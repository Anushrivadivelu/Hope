package com.payroll.model;

public class PartTimeEmployee extends Employee{
  private int hoursWorked;
  private int hoursRate;
  public PartTimeEmployee(int empid, String name,double baseSalary,int hoursWorked,int hoursRate){
    super(empid, name, baseSalary);
    this.hoursWorked=hoursWorked;
    this.hoursRate=hoursRate;
  }
  @Override
  public double calculateSalary(){
    return hoursWorked * hoursRate;
  }
  @Override
  public void displayDetails(){
    System.out.println("----PART TIME EMPLOYEE----");
    System.out.println("Employee ID: "+ getEmpid());
    System.out.println("Employee Name: "+getName());

    System.out.println("HoursWorked: "+hoursWorked);
    System.out.println("HoursRate: "+ hoursRate);
    System.out.println("Total Salary: "+ calculateSalary());
  }

}