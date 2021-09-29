package wildcodeschool;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class myTreeSetExample {

    public static void main(String[] args) {

        String[] myString = {"z", "y", "x"};
        Integer[] myInteger = {9, 7, 8};

        Set<String> myStringTreeSet = new TreeSet<String>(Arrays.asList(myString));
        Set<Integer> myIntegerTreeSet = new TreeSet<>(Arrays.asList(myInteger));

        //TreeSet sorts elements in natural order. Therefore null isn't allowed
        System.out.println(myStringTreeSet);
        for(String myValue : myStringTreeSet){
            System.out.println(myValue);
        }

        System.out.println("\n" + myIntegerTreeSet);
        for(Integer myValue : myIntegerTreeSet){
            System.out.println(myValue);
        }
    }
}
