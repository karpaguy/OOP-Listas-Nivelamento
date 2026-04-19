package br.edu.ifsp.EmployeeReport.GenericVersion;

public class ConsoleExporter implements Exporter {
    @Override
    public void export(String content, String destination) {
        System.out.println(content);
    }
}
