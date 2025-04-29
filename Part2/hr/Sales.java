package day04.Part2.hr;

import day04.Part2.ISalary;
import day04.Part2.Roles;
import day04.Part2.salary.Commission;
import day04.Part2.salary.Overtime;
import java.time.LocalDate;

public class Sales extends Employee implements ISalary {

    private Commission commission;
    private Overtime makan;


    public Sales(int empId, String fullName, LocalDate hireDate, Roles role, double salary, Commission commission,
                 Overtime makan) {
        super(empId, fullName, hireDate, role, salary);
        this.commission = commission;
        this.makan = makan;
    }

    @Override
    public void calculateTotalSalary() {
        setTotalSalary((getSalary()+ commission.getComission()+ commission.getBonus()+ makan.getMakan())- getTotalTax());
    }

    @Override
    public void calculateTax() {
        setTotalTax(getSalary() * 0.01);
    }
}