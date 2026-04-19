package br.edu.ifsp.EmployeeReport.GenericVersion;

public class ExporterFactory {
    private ExporterFactory(){};

    public static Exporter forProductionEnvironment() {
        return new FileExporter(); // Retorno polimórfico, nunca código direto.
    }

    public static Exporter forDevelopmentEnvironment() {
        return new ConsoleExporter();
    }
}
