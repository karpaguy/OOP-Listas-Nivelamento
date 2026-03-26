package br.edu.ifsp.NameConvention;
import java.util.regex.Pattern;

public class NameConventions {
    //TODO a ideia do exercício era usar a manipulação de chars, para praticar, mas
    // regex é o mais indicado. Se está familiar com isso, pode tocar.
    private NameConventions() {};
    public static boolean isFollowingConvention(String jString, Conventions convention) {
        return switch (convention) {
            // javaString.matches é um análogo a Pattern.matches(regex, input).
            // O ideal seria usar um
            case VARIABLE, METHOD -> jString.matches("^[a-z][a-zA-Z0-9]*$");
            case CONSTANT -> jString.matches("^[A-Z][A-Z0-9_A-Z0-9]*$");
            case CLASS -> jString.matches("^[A-Z][a-zA-Z0-9]*$");
        };
    }

    //TODO isso mesmo
    public static String fromConstToVariable(String jString) {
        jString = jString.toLowerCase();
        for (int i = 0; i < jString.length(); i++) {
            if (jString.charAt(i) == '_') {
                jString = jString.substring(0, i) + Character.toUpperCase(jString.charAt(i+1)) + jString.substring(i+2);
            }
        }
        return jString;
    }

    //TODO tá good
    public static String fromVariableToConst(String jString) {
        for (int i = 0; i < jString.length(); i++) {
            if (Character.isUpperCase(jString.charAt(i))) {
                jString = jString.substring(0, i) + "_" + jString.substring(i++); // String aumenta, evita loop infinito.
            }
        }
        System.out.println(jString);
        return jString.toUpperCase();
    }
}
