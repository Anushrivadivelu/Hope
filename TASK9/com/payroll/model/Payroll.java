//Payroll.java
package com.payroll.model;

import java.util.ArrayList;

public class Payroll{
  private ArrayList<Employee> emp = new ArrayList<>();
  public ArrayList<Employee> getEmployees(){
    return emp;
  }
  public void addEmployee(Employee e){
    emp.add(e);
  }
  public void removeEmployee(Employee e){
    emp.remove(e);
  }
  public void displayEmployees(){
    for(Employee e: emp){
      e.displayDetails();
    }
  }
}
