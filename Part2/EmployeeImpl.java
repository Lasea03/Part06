package day04.Part2;

import day04.Part2.Roles;
import day04.Part2.hr.Employee;
import day04.Part2.hr.Programmer;
import day04.Part2.hr.QA;
import day04.Part2.hr.Sales;
import day04.Part2.salary.Commission;
import day04.Part2.salary.Transportasi;
import day04.Part2.salary.Overtime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl implements IEmployee {
    @Override
    public List<Employee> initListEmployee() {
        List<Employee> employees = new ArrayList<>();

        Programmer emp1 = new Programmer(
                101, "Yuli", LocalDate.of(2025, 12, 12), Roles.PROGRAMMER, 6_000_000,
                new Transportasi(LocalDate.now(), 500_000, 150_000, 100_000), new Overtime(LocalDate.now(), 50_000)
        );

        Programmer emp2 = new Programmer(
                102, "Widi", LocalDate.of(2025, 12, 12), Roles.PROGRAMMER, 5_000_000,
                new Transportasi(LocalDate.now(), 100_000, 50_000, 100_000), new Overtime(LocalDate.now(), 50_000)
        );

        Sales emp3 = new Sales(103,"Fahmi",
                LocalDate.of(2025,12,12), Roles.SALES,5_000_000,
                new Commission(LocalDate.now(),100_000,50_000), new Overtime(LocalDate.now(), 50_000)
        );


        QA emp4 = new QA(
                104, "Rina", LocalDate.of(2025, 12, 12), Roles.QA, 5_000_000,
                new Overtime(LocalDate.now(), 50_000)
        );

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        return employees;
    }

    @Override
    public void generateSalary(List<Programmer> programmers, List<Sales> sales) {
        for (Programmer p : programmers) {
            p.calculateTotalSalary();
        }
        for (Sales s : sales) {
            s.calculateTotalSalary();
        }
    }

    @Override
    public void generateSalary(List<Sales> employees) {
        for (Sales s : employees) {
            s.calculateTotalSalary();
        }
    }

    @Override
    public void displayEmployees(List<Programmer> programmers, List<Sales> sales) {
        for (Programmer p : programmers) {
            System.out.println(p);
        }
        for (Sales s : sales) {
            System.out.println(s);
        }
    }

    @Override
    public void generateTax(List<Employee> employees) {
        for (Employee emp : employees) {
            emp.calculateTax();
        }
    }
}
