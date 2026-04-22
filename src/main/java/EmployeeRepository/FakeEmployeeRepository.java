package br.edu.ifsp.src.main.java.EmployeeRepository;

public class FakeEmployeeRepository implements Repository<Employee, String> {
    private final Employee[] employees;
    private int pos;

    public FakeEmployeeRepository() {
        this.employees = new Employee[50]; // Tamanho grande o suficiente para não se preocupar com esse detalhe.
    }

    @Override
    public void add(Employee e) {
        employees[pos] = e;
    }

    @Override // public T findById(U id);
    public Employee findById(String id) {
        for (Employee e : employees) {
            if(e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
}
