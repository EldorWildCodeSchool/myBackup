package wildcodeschool;


import java.util.Scanner;

public class Numeric {

    public static int gebeWertEin() {
        // Input
        int eingabeZahl = 0;
        Scanner sc;
        System.out.println("Zahl zur Berechnung: ");
        sc = new Scanner(System.in);
        eingabeZahl = sc.nextInt();
        return eingabeZahl;
    }

    public static void main(String[] args) {

        int x = gebeWertEin();

        // Challenge a) + b)
        if (x % 2 == 0) {
            System.out.println("Diese Zahl ist gerade");
        } else {
            System.out.println("Diese Zahl ist total krumm");
        }

        // Challenge c)
        x = gebeWertEin();

        System.out.println("Die Quadratzahl ist: " + x * x);

        // Challenge d)
        x = gebeWertEin();

        System.out.println("Die Kubikzahl ist: " + x * x * x);

    }
}