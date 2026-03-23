package br.edu.ifsp.Strings_Exercises;

public class Ex01Email {
    private Ex01Email() {}

    public static boolean isEmail(String email, String finale) {
        // CONVENÇÃO DE EMAIL: S1 + @ + S2 + .com
        // Isto seria lindo, mas não pode REGEX. → final String[] emailSliced = email.split('@');
        for (int i = 0; i < email.length(); i++) {
            if(i > 0 && email.charAt(i) == '@' && email.substring(email.length() - finale.length()).equals(finale)) {
                return true;
            }
        }
        return false;
    }
}