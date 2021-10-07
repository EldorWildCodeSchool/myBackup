package wildcodeschool.quests.Generics01.Introduction_to_Java_Generics.solution_with_arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedSizedListTest {

    @Test
    void add5ValuesIncludingNULL() {
        FixedSizedList<String> myList = new FixedSizedList<>();
        myList.add(null);
        myList.add("Hallo");
        myList.add("Welt");
        myList.add("du");
        myList.add(null);
        assertNull(myList.get(0));
        assertNull(myList.get(4));
    }

    @Test
    void add6thValue() {
        FixedSizedList<String> myList = new FixedSizedList<>();
        myList.add(null);
        myList.add("Hallo");
        myList.add("Welt");
        myList.add("du");
        myList.add(null);

        String sixthString = "Ich fliege auf die Fresse";
        myList.add(sixthString);
        assertEquals(5, myList.size());
        assertFalse(myList.contains(sixthString));
    }

    @Test
    void removeNonIncludingValue() {
        FixedSizedList<String> myList = new FixedSizedList<>();
        myList.add(null);
        myList.add("Hallo");
        myList.add("Welt");
        myList.add("du");
        myList.add(null);

        String removeString = "Ich fliege auf die Fresse";
        myList.remove(removeString);
        assertEquals(5, myList.size());
    }

    @Test
    void get() {
        FixedSizedList<String> myList = new FixedSizedList<>();
        myList.add("Hallo");
        myList.add("Welt");
        myList.add("du");
        String getString = "liebliche";
        myList.add(getString);

        assertEquals(getString, myList.get(3));
    }

    @Test
    void size() {
        FixedSizedList<String> myList = new FixedSizedList<>();
        myList.add("Oh");
        myList.add("du");
        myList.add("fröhliche");
        myList.add("...");
        assertEquals(4, myList.size());
    }

    @Test
    void contains() {
        FixedSizedList<String> myList = new FixedSizedList<>();
        myList.add(null);
        myList.add("Hallo");
        myList.add("Welt");
        myList.add("du");
        myList.add(null);

        String containString = "Welt";
        assertTrue(myList.contains(containString));
    }
}