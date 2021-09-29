package wildcodeschool.quests.Java05.Methods;

import java.util.Random;

public class Numeric {

    //Run this code at: https://www.jdoodle.com/online-java-compiler/

    public static void main(String[] args) {
        int myFirstInt = getEvenRandom(50);
        int mySecondInt = getOddRandom(50);
        System.out.println("Odd or not?");
        System.out.println("Is the number " + myFirstInt + " odd? Result: " + isOdd(myFirstInt));
        System.out.println("Is the number " + mySecondInt + " odd? Result: " + isOdd(mySecondInt) + "\n");
        System.out.println("Even or not?");
        System.out.println("Is the number " + myFirstInt + " even? Result: " + isEven(myFirstInt));
        System.out.println("Is the number " + mySecondInt + " even? Result: " + isEven(mySecondInt) + "\n");
        System.out.println("Numbers to square:");
        System.out.println("The result of " + myFirstInt + " to square is: " + toSquare(myFirstInt));
        System.out.println("The result of " + mySecondInt + " to square is: " + toSquare(mySecondInt) + "\n");
        System.out.println("Numbers to qube:");
        System.out.println("The result of " + myFirstInt + " to cube is: " + toCube(myFirstInt));
        System.out.println("The result of " + mySecondInt + " to cube is: " + toCube(mySecondInt) + "\n");
    }

    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int toSquare(int value) {
        return value * value;
    }

    public static int toCube(int value) {
        return value * value * value;
    }

    public static int getEvenRandom(int value) {
        Random rand = new Random();
        int random = rand.nextInt(value);
        random = (random * 2) % value;
        return random;
    }

    public static int getOddRandom(int value) {
        Random rand = new Random();
        int random = rand.nextInt(value);
        random = (random * 3) * 2 + 1;
        return random;
    }
}