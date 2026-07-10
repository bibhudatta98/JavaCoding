// Finds the second-highest salary in the Engineering department using Java Streams. It filters employees by department, maps to salaries, removes duplicates, sorts in reverse order, skips the highest salary, and retrieves the second highest salary if it exists.**//
package com.java.Streams;
import java.util.*;
import java.util.stream.*;

public class Employee {
    private String name;
    private String department;
    private double salary;
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public static void main(String[] args) {
        List<Employee> employees= List.of(
                new Employee("John","Engineering", 50000),
                new Employee("Jane","HR" ,20000),
                new Employee("Bob","Engineering", 45000),
                new Employee("Alice","Admin", 55000)
        );
        Optional<Double> secondHighest = employees.stream()
                .filter(e ->e.department.equals("Engineering"))
                .map(e ->e.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
                secondHighest.ifPresent(s->
                        System.out.println("Second highest salary: " + s));
    }
}
