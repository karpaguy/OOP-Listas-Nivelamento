package br.edu.ifsp.Simulados.P1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private UserAccount user;
    private String quote;
    private LocalDateTime date;
    private int claps;
    private int boos;

    public Post(String quote, UserAccount account) {
        this.quote = quote;
        this.user = account;
        this.date = LocalDateTime.now();
        this.claps = 0;
        this.boos = 0;
    }

    public String show() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s %s says \"%s\" | Claps: %d | Boos: %d",
                formatter.format(this.date),
                this.user.getUserName(),
                this.quote,
                this.claps,
                this.boos
        );
    }

    public void boo() {
        this.boos++;
    }
    public void claps() {
        this.claps++;
    }

    public String getQuote() {
        return quote;
    }
    public int getClaps() {
        return claps;
    }
    public int getBoos() {
        return boos;
    }
}
