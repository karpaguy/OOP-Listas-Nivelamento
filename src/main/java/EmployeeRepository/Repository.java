package br.edu.ifsp.src.main.java.EmployeeRepository;

public interface Repository <T, U> {
    void register(T element);
    T findById(U id);
}
