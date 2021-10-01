package codecatcher.percipio.java_apprentice.track_07_Generics;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** A single repository holding objects");

        Repository fifteen = new Repository(15);
        System.out.println("Klasse des Objektes fifteen: " + fifteen.getClass());
        System.out.println("Klasse des Wertes 'value' des Objektes fifteen " + fifteen.getValue().getClass());
        //Integer myIntValueUncasted = new Integer(fifteen.getValue());
        Integer myIntValueCasted = (Integer) fifteen.getValue();
        //myIntValueUncasted++;
        myIntValueCasted++;

        /*
        Repository tenPointOne = new Repository(10.1);
        System.out.println(tenPointOne);

        Repository helloGenerics = new Repository("Hello generics!");
        System.out.println(helloGenerics);

        Repository today = new Repository(Calendar.getInstance().getTime());
        System.out.println(today);
        */
        // Run
    }
}
