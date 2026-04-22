package br.edu.ifsp.src.main.java.EmployeeRepository;

public interface Repository <T, U> {
    void add(T element);
    T findById(U id);
}
