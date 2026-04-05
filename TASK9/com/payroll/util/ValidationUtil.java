package com.payroll.util;

public class ValidationUtil {
  public static boolean validateName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean validateSalary(double salary) {
        return salary >= 0;
    }

    public static boolean validateHours(int hours) {
        return hours >= 0;
    }

    public static boolean validateRate(int rate) {
        return rate > 0;
    }
}
