package com.payroll.util;

public class TaxUtil {
  public static double calculateTax(double salary) {
    if (salary > 50000) {
        return salary * 0.1;  // 10%
    } else {
        return salary * 0.05; // 5%
    }
  }
}
