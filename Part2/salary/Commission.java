package day04.Part2.salary;

import java.time.LocalDate;

public class Commission extends Salary{
    private double comission;
    private double bonus;

    public Commission(LocalDate payDay, double comission, double bonus) {
        super(payDay);
        this.comission = comission;
        this.bonus = bonus;
    }

    public double getComission() {
        return comission;
    }

    public void setComision(double comission) {
        this.comission = comission;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}