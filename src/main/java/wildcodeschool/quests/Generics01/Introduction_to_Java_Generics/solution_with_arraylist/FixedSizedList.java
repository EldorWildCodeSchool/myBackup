package wildcodeschool.quests.Generics01.Introduction_to_Java_Generics.solution_with_arraylist;

import java.util.ArrayList;

public class FixedSizedList<T> {

    private static final int DEFAULT_CAPACITY = 5;
    private ArrayList<T> elements;


    public FixedSizedList() {
        elements = new ArrayList<T>(DEFAULT_CAPACITY);
    }

    public void add(T element) {
        if (elements.size() < DEFAULT_CAPACITY) {
            elements.add(element);
            System.out.println("Element '" + element + "' added to the list.");
        } else {
            System.err.println("Maximum list size ("+ DEFAULT_CAPACITY + ") exceeded. Element '" + element + "' not added to the list.");
        }
    }

    public void remove (T element){
        if (elements.size() > 0) {
            boolean elementContained = elements.contains(element);
            if(elementContained){
                elements.remove(element);
                System.out.println("Element '" + element + "' removed from list. Actual list size is " + elements.size());
            }else{
                System.err.println("Element '" + element + "' not in the list. Nothing to remove");
            }
        } else {
            System.err.println("List is empty. No entries to remove.");
        }
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if(index <= elements.size()){
            T result = elements.get(index);
            System.out.println("Element '" + result + "' in index position found and returned");
            return result;
        } else throw new IndexOutOfBoundsException();
    }

    public int size(){
        return elements.size();
    }

    public boolean contains(T element){
        if (elements.size() > 0) {
            boolean elementContained = elements.contains(element);
            if(elementContained){
                System.out.println("Element '" + element + "' is contained in the list");
                return true;
            }else{
                System.err.println("Element '" + element + "' not in the list");
                return false;
            }
        } else {
            System.err.println("List is empty. No entries to remove.");
            return false;
        }
    }
}