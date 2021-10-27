package codecatcher.snippets;

import java.util.*;

public class IsPartOfCollection {

    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();

        System.out.println("ArrayList is instance of List: " + (myArrList instanceof List));
        System.out.println("ArrayList is instance of Collection: " + (myArrList instanceof Collection));
        System.out.println("ArrayList is instance of Iterable: " + (myArrList instanceof Iterable));
        System.out.println("");

        HashMap<String, String > myHashMap = new HashMap<>();

        System.out.println("HashMap is instance of Map: " + (myHashMap instanceof Map));
        System.out.println("HashMap is instance of Collection: " + (myHashMap instanceof Collection));
        System.out.println("HashMap is instance of Iterable: " + (myHashMap instanceof Iterable));



    }

}
