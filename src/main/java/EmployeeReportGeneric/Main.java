package br.edu.ifsp.src.main.java.EmployeeReportGeneric;

import java.time.LocalDate;

public class Main {
    public void main(String[] args) {
        Employee[] employees = {
                new Employee("Giraldo Roberto", LocalDate.parse("1940-01-27"), LocalDate.parse("1916-04-30")),
                new Employee("Augusto Marinho", LocalDate.parse("1960-03-07"), LocalDate.parse("1904-04-30")),
                new Employee("David Huffman", LocalDate.parse("1938-11-22"), LocalDate.parse("1925-07-09"))
        };

        // Exporter exporter = new FileExporter();
        Exporter exporter = ExporterFactory.forProductionEnvironment();
        Formatter<Employee> formatter = new CsvFormatter<>();

        // Exporter exporter2 = new ConsoleExporter();
        Exporter exporter2 = ExporterFactory.forDevelopmentEnvironment();

        //Injeção de dependência.
        ReportService<Employee> report = new ReportService<>(exporter, formatter);
        report.createReport(employees, "legends.csv");

        ReportService<Employee> reportDev = new ReportService<>(exporter2, formatter);
        reportDev.createReport(employees, "");
    }
}
