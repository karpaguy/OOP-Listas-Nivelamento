package br.edu.ifsp.src.main.java.EmployeeReportGeneric;

public interface Formatter <T extends Reportable> {
    String format(T[] elements);
}
