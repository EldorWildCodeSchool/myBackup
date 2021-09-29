package wildcodeschool;

public class BoolenAsAVariableContainer {

    public static void main(String[] args) {

        //Beispiel, wie ein Wahrheitswert (age >= 18) einer boolschen Variablen zugewiesen wird, damit diese weiterverwendet werden kann.
        //Dies macht besonders dann Sinn, wenn "hasLegalAge" mehr als einmal im Code verwendet werden soll
        //Dient ausserdem der besseren Lesbarkeit
        int age = 18;
        boolean hasLegelAge = age >=18;

        System.out.println((hasLegelAge ? "yes" : "no"));
    }
}