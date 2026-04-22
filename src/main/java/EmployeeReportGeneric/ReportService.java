package br.edu.ifsp.src.main.java.EmployeeReportGeneric;

public class ReportService <T extends Reportable> {
    private final Exporter exporter;
    private final Formatter<T> formatter;

    public ReportService(Exporter exporter, Formatter<T> formatter) {
        this.exporter = exporter;
        this.formatter = formatter;
    }

    public void createReport(T[] elements, String destination) {
        final String formatted = formatter.format(elements);
        exporter.export(formatted, destination);
    }
}
