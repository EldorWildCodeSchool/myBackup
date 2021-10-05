package wildcodeschool.quests.Generics01.Introduction_to_Java_Generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyOwnListTest {

    @Test
    void add() {
        MyOwnList<String> myListTestString = new MyOwnList<>();
        myListTestString.add("String 1");
        myListTestString.add("String 2");
        myListTestString.add("String 3");
        myListTestString.add("String 4");
        myListTestString.add("String 5");
        myListTestString.add("");

        MyOwnList<Integer> myListTestInteger = new MyOwnList<>();
        myListTestInteger.add(100);
        myListTestInteger.add(200);
        myListTestInteger.add(300);
        myListTestInteger.add(400);
        myListTestInteger.add(500);
        myListTestInteger.add(null);

        assertEquals("[String 1,String 2,String 3,String 4,String 5,]", myListTestString.toString());
        assertEquals("[100,200,300,400,500,]", myListTestInteger.toString());
    }

    @Test
    void get() {

        MyOwnList<String> myListTestString = new MyOwnList<>();
        myListTestString.add("String 1");
        myListTestString.add("String 2");
        myListTestString.add("String 3");
        myListTestString.add("String 4");
        myListTestString.add("String 5");
        myListTestString.add("");

        assertEquals("String 4", myListTestString.get(3));
    }

    @Test
    void remove() {
        MyOwnList<String> myListTestString = new MyOwnList<>();
        myListTestString.add("String 1");
        myListTestString.add("String 2");
        myListTestString.add("String 3");
        myListTestString.add("String 4");
        myListTestString.add("String 5");
        myListTestString.add("");

        myListTestString.remove(1);
        assertEquals("[String 1,String 3,String 4,String 5,]", myListTestString.toString());
        myListTestString.remove(4);
        assertEquals("[String 1,String 3,String 4,String 5]", myListTestString.toString());
    }

    @Test
    void getListSize() {
        MyOwnList<String> myListTestString = new MyOwnList<>();
        myListTestString.add("String 1");
        myListTestString.add("String 2");
        myListTestString.add("String 3");
        myListTestString.add("String 4");
        myListTestString.add("String 5");
        myListTestString.add("");

        myListTestString.remove(1);
        assertEquals(5, myListTestString.getListSize());
        myListTestString.remove(4);
        assertEquals(4, myListTestString.getListSize());
    }
}