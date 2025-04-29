package day04.Part2.salary;

import java.time.LocalDate;

/**
 * Class Overtime represents an additional allowance for overtime work.
 */
public class Overtime extends Salary {
    private double makan;

    public Overtime(LocalDate payDay, double makan) {
        super(payDay);
        setMakan(makan);
    }

    public double getMakan() {
        return makan;
    }

    public void setMakan(double makan) {
        if (makan < 0) {
            throw new IllegalArgumentException("Overtime allowance (makan) cannot be negative");
        }
        this.makan = makan;
    }
}
