package br.edu.ifsp.src.main.java.EmployeeReport;

public class ConsoleExporter implements Exporter {
    @Override
    public void export(String content, String destination) {
        System.out.println(content);
    }
}
