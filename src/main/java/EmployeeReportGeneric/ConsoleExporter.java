package br.edu.ifsp.src.main.java.EmployeeReportGeneric;

public class ConsoleExporter implements Exporter {
    @Override
    public void export(String content, String destination) {
        System.out.println(content);
    }
}
