package br.edu.ifsp.src.main.java.P1_SocialNetwork;

public class Main {
    public static void main(String args[]) {
        UserAccount Teobaldo = new UserAccount("teobaldo@gmail.com", "teobaldo28");
        UserAccount Leopoldo = new UserAccount("leopoldo@gmail.com", "XxleopoldoxX");

        Teobaldo.acceptFollower(Leopoldo);
        Teobaldo.publish("Treinar costas é muito legal, meus manos.");
        Teobaldo.publish("Treinar pernas é muito legal, meus manos.");
        Teobaldo.delete(1);
        Leopoldo.clapPost(1);
        Leopoldo.clapPost(1);
        Teobaldo.publish("Treinar pernas é muito TOP, meus manos.");

        System.out.println(Leopoldo.showTimeline());
        System.out.println("-----");

        Leopoldo.booPost(2);
        Teobaldo.blockFollower(Leopoldo);
        Teobaldo.publish("To pobre.");
        System.out.println(Leopoldo.showTimeline());
    }
}
