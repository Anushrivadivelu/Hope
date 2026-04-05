package com.payroll.model;

public abstract class Employee{
  private int empid;
  private String name;
  protected double baseSalary;
  public Employee(int empid, String name, double baseSalary){
    this.empid=empid;
    this.name=name;
    this.baseSalary = baseSalary;
  }
  public abstract double calculateSalary();
  public int getEmpid(){
    return empid;
  }
  public String getName(){
    return name;
  }
  public double getBaseSalary(){
    return baseSalary;
  }
  public void displayDetails(){
    System.out.println("Employee ID: "+ empid);
    System.out.println("Employee Name: "+name);
    //System.out.println("Employee Salary: "+ baseSalary);
  }
}
