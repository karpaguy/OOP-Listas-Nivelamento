package br.edu.ifsp.EmployeeReport;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate dateOfEmployment;
    private LocalDate birthDate;

    public Employee(String name, LocalDate dateOfEmployment, LocalDate birthDate) {
        this.name = name;
        this.dateOfEmployment = dateOfEmployment;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getYearsOfService() {
        return 1;
    }
}
