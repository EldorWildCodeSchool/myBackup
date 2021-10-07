package wildcodeschool.quests.Generics01.Introduction_to_Java_Generics.solution_with_array;

import java.util.Arrays;

public class MyOwnList<E> {
    // Most of this implementation is from:
    // https://howtodoinjava.com/data-structure/list-implementation-example-in-java/
    // Also read:
    // https://www.baeldung.com/java-generic-array

    private int listSize = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    //Constructor
    public MyOwnList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Add new element to the array
    public void add(E addElement){
        if(listSize == elements.length){
            enlargeCapacity();
        }
        elements[listSize++] = addElement;
    }

    // return value for an array element
    public E get(int index){
        if (index >= listSize || index < 0 ){
            throw new IndexOutOfBoundsException("Index is " + index + " but array index is only 0 to " + listSize);
        }
        return (E) elements[index];
    }

    // return value for an array element
    // Split the array around the value to be removed (subset 1 up to the value to be removed
    // and subset 2 starting after the value to be removed) and then reassign these two subsets to the array
    public E remove(int index){
        if (index >= listSize || index < 0 ){
            throw new IndexOutOfBoundsException("Index is " + index + " but array index is only 0 to " + listSize);
        }
        Object item = elements[index];
        int numberElements = elements.length - (index + 1);
        System.arraycopy(elements, index + 1, elements, index, numberElements);
        listSize--;
        return (E) item;
    }


    // Helper methods
    // Doubles the size of the current array
    private void enlargeCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    //Print method
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < listSize ;i++) {
            if (elements[i] != null){
                sb.append(elements[i].toString());
            }
            if(i < listSize - 1){
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    //Getters
    public int getListSize() {
        return listSize;
    }
}
