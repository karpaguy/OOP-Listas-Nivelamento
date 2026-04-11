package br.edu.ifsp.Heritage.Enterprise;

import java.time.LocalDate;

public final class PerTimeEmployee extends Employee {
    private double hourlyRate;
    private int workedHour;

    public PerTimeEmployee(String name, String jobTitle, LocalDate dateOfEmployment, double hourlyRate, int workedHour) {
        super(name, jobTitle, dateOfEmployment);
        this.hourlyRate = hourlyRate;
        this.workedHour = workedHour;
    }

    @Override
    public double salary() {
        return this.hourlyRate * this.workedHour;
    }
}
