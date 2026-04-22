package br.edu.ifsp.src.main.java.EmployeeRepository;

import java.time.LocalDate;

public class Main {
    public void main(String[] args) {
        Employee emp1 = new Employee("1", "Jose", "Professor", 1000.00, LocalDate.of(2010,10,05));
        Employee emp2 = new Employee("2", "Jose", "Professor", 1000.00, LocalDate.of(2010,10,05));
        Employee emp3 = new Employee("3", "Jose", "Professor", 1000.00, LocalDate.of(2010,10,05));

        FakeEmployeeRepository repo = new FakeEmployeeRepository();

        repo.add(emp1);
        repo.add(emp2);
        repo.add(emp3);

        System.out.println("OK");
    }
}
