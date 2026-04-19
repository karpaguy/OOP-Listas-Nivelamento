package br.edu.ifsp.EmployeeReport.GenericVersion;

public interface Formatter <T extends Reportable> {
    String format(T[] elements);
}
