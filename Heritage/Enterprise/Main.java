package br.edu.ifsp.Heritage.Enterprise;

import java.time.LocalDate;

public class Main {
    public void main(String[] args) {
        FullTimeEmployee senhor = new FullTimeEmployee("Senhor", "CEO", LocalDate.of(1990, 10, 10), 1000);
        System.out.println(senhor.salary());
    }
}
