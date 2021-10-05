package codecatcher.percipio.java_apprentice.Lab.List_Operations_02;

import java.util.*;

public class Listiterator {

    public static void main(String[] args) {

        // 1. Create a List and add elements to the List
        // 2. Replacing an element in the List
        // 3. Sorting the elements in the List
        // 4. Removing an elements in the List
        // 5. Using ListIterator interface to traverse the element

        // 1. Create a List and add elements to the List
        String[] listOfNames = new String[]{"Christiane", "Corinna", "Arman", "Alex", "Reinhard", "Martin", "Michael", "Momme", "Marco", "David", "Leander", "Eldor"};
        List<String> myListArray = new ArrayList<>(Arrays.asList((listOfNames)));
        System.out.println("TASK 1. LIST WITH VALUES IS CREATED");
        for(String student : myListArray){
            System.out.println(student);
        }
        System.out.println("");

        // 2. Replacing an element in the List
        System.out.println("TASK 2. REPLACING REINHARD (4) BY BURP");
        myListArray.set(4, "BURP");
        for(String student : myListArray){
            System.out.println(student);
        }
        System.out.println("");

        // 3. Sorting the elements in the List
        Collections.sort(myListArray);
        System.out.println("TASK 3. SORTING THE LIST ASCENDING");
        for(String student : myListArray){
            System.out.println(student);
        }
        System.out.println("");

        // 4. Removing an elements in the List
        System.out.println("TASK 4. REMOVE THE ELEMENT BURP FROM THE LIST");
        myListArray.remove("BURP");
        for(String student : myListArray){
            System.out.println(student);
        }
        System.out.println("");

        // 5. Using ListIterator interface to traverse the element
        ListIterator<String> mylistIterator= myListArray.listIterator();
        System.out.println("TASK 5. USE THE ListIterator INTERFACE TO TRAVERSE THE ELEMENTS - FORWARD");
        while(mylistIterator.hasNext()){
            System.out.println(mylistIterator.next());
        }
        System.out.println("");
        System.out.println("TASK 5. USE THE ListIterator INTERFACE TO TRAVERSE THE ELEMENTS - BACKWARDS");
        while(mylistIterator.hasPrevious()){
            System.out.println(mylistIterator.previous());
        }
    }
}
