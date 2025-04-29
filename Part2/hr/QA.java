package day04.Part2.hr;

import day04.Part2.ISalary;
import day04.Part2.salary.Overtime;
import day04.Part2.Roles;

import java.time.LocalDate;

public class QA extends Employee implements ISalary {
    private Overtime makan;

    public QA(int empId, String fullName, LocalDate hireDate, Roles role, double salary, Overtime makan) {
        super(empId, fullName, hireDate, role, salary);
        this.makan = makan;
    }

    @Override
    public void calculateTotalSalary() {
        setTotalSalary(getSalary() + makan.getMakan());
    }
}
