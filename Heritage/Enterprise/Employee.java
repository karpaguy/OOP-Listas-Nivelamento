package br.edu.ifsp.Heritage.Enterprise;

import java.time.LocalDate;

    public abstract sealed class Employee permits FullTimeEmployee, PerTimeEmployee {
    private static int id = 0;
    private String name;
    private String jobTitle;
    private LocalDate dateOfEmployment;

    public Employee(String name, String jobTitle, LocalDate dateOfEmployment) {
        this.id = id++;
        this.name = name;
        this.jobTitle = jobTitle;
        this.dateOfEmployment = dateOfEmployment;
    }

    public abstract double salary();

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }
}
