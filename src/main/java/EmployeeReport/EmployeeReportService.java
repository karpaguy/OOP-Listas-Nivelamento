package br.edu.ifsp.src.main.java.EmployeeReport;

public class EmployeeReportService {
    private final Exporter exporter;
    private final EmployeeFormatter formatter;

    public EmployeeReportService(Exporter exporter, EmployeeFormatter formatter) {
        this.exporter = exporter;
        this.formatter = formatter;
    }

    public void createReport(Employee[] employees, String destination) {
        final String formatted = formatter.format(employees);
        exporter.export(formatted, destination);
    }
}
