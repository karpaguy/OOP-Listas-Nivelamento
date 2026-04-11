package br.edu.ifsp.Heritage.Enterprise;

import java.time.LocalDate;

public final class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, String jobTitle, LocalDate dateOfEmployment, double monthlySalary) {
        super(name, jobTitle, dateOfEmployment);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double salary() {
        return this.monthlySalary;
    }
}
