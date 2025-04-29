package day04.Part2;

import day04.Part2.hr.Employee;
import day04.Part2.hr.Programmer;
import day04.Part2.hr.Sales;

import java.util.List;

public interface IEmployee {
    List<Employee> initListEmployee();
    void displayEmployees(List<Programmer> programmers, List<Sales> sales);
    void generateSalary(List<Programmer> programmers, List<Sales> sales);
    void generateSalary(List<Sales> employees);
    void generateTax(List<Employee> employees);  // ← tambahkan ini
}
