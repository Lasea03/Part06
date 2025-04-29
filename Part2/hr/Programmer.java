package day04.Part2.hr;

import day04.Part2.Roles;
import day04.Part2.ISalary;
import day04.Part2.salary.Overtime;
import day04.Part2.salary.Transportasi;

import java.time.LocalDate;

public class Programmer extends  Employee implements ISalary {

    private Transportasi transport;
    private Overtime overtime;
    public Programmer(int empId, String fullName, LocalDate hireDate, Roles role, double salary,
                      Transportasi transport, Overtime overtime) {
        super(empId, fullName, hireDate, role, salary);
        this.transport = transport;
        this.overtime = overtime;

    }
    @Override
    public void calculateTotalSalary() {
        setTotalSalary(
                getSalary()
                        + transport.getBensin()
                        + transport.getSpj()
                        + transport.getTransportasi()
                        + overtime.getMakan()
        );
    }
    public Transportasi getTransport() {
        return transport;
    }

    public void setTransport(Transportasi transport) {
        this.transport = transport;
    }

}
