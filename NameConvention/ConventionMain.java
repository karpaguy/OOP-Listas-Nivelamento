package br.edu.ifsp.NameConvention;

public class ConventionMain {
    public static void main() {
        String brasil = "boaFunc";

        // brasil = NameConventions.fromConstToVariable(brasil);
        brasil = NameConventions.fromVariableToConst(brasil);
        boolean resultado = NameConventions.isFollowingConvention(brasil, Conventions.CONSTANT);
        if (resultado) {
            System.out.println("OK");
        }


    }
}
