package br.edu.ifsp.Strings_Exercises;

public class Ex02WordCount {
    private Ex02WordCount() {}

    public static int wordTotalInPhrase(String phrase, String word) {
        // Bompeixe != peixe >:(
        phrase = phrase.replace(".","");
        phrase = phrase.replace(",", "");
        final String[] splitPhrase = phrase.toLowerCase().split(" ");
        int acc = 0;
        for (String w : splitPhrase) {
            if (w.toLowerCase().equals(word)) acc++;
        }

        return acc;
    }
}
