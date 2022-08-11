package com.liberty.classes;

public class EmployeeTest1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Tom", 1200, 1987, 12, 3);
        employees[1] = new Employee("Bob", 2300, 1997, 12, 3);
        employees[2] = new Employee("Ming", 1500, 1977, 12, 3);

        for (Employee employee : employees) {
            employee.raiseSalary(5);
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
