package day04.Part2;

import day04.Part2.hr.Programmer;
import day04.Part2.hr.Sales;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        IEmployee empInf = new EmployeeImpl();
        var employees = empInf.initListEmployee();

        List<Programmer> programmers = employees.stream()
                .filter(Programmer.class::isInstance)
                .map(Programmer.class::cast)
                .collect(Collectors.toList());

        List<Sales> sales = employees.stream()
                .filter(Sales.class::isInstance)
                .map(Sales.class::cast)
                .collect(Collectors.toList());

        empInf.generateSalary(programmers, sales);
        empInf.displayEmployees(programmers, sales);
    }
}
