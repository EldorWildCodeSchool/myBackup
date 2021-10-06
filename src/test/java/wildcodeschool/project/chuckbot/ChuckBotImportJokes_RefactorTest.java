package wildcodeschool.project.chuckbot;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ChuckBotImportJokes_RefactorTest {

    @Test
    void importJokesArrayList() {
        System.out.println("--- TESTING ARRAY LIST ---");
        ArrayList<String> myList = new ArrayList<String>();
        ArrayList<String> myTempObject = new ArrayList<String>(ChuckBotImportJokes_Refactor.importJokesGenericList(myList, "src/test/resources/jokes.txt"));
        myList = (ArrayList<String>)myTempObject.clone();
        assertEquals(250,myList.size());
    }

    @Test
    void importJokesLinkedList() {
        System.out.println("--- TESTING LINKED LIST ---");
        LinkedList<String> myList = new LinkedList<>();
        LinkedList<String> myTempObject = new LinkedList<>(ChuckBotImportJokes_Refactor.importJokesGenericList(myList, "src/test/resources/jokes.txt"));
        myList = (LinkedList<String>)myTempObject.clone();
        assertEquals(250,myList.size());
    }

    @Test
    void importJokesArrayListFailFileExtension(){
        System.out.println("--- TESTING WRONG FILE TYPE WITH ARRAY LIST ---");
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> myTempObject = new ArrayList<>(ChuckBotImportJokes_Refactor.importJokesGenericList(myList, "src/test/resources/orange.png"));
        myList = (ArrayList<String>)myTempObject.clone();
        assertEquals(0, myList.size());
    }

    @Test
    void importJokesLinkedListFailFileExtension(){
        System.out.println("--- TESTING WRONG FILE TYPE WITH LINKED LIST ---");
        LinkedList<String> myList = new LinkedList<>();
        LinkedList<String> myTempObject = new LinkedList<>(ChuckBotImportJokes_Refactor.importJokesGenericList(myList, "src/test/resources/orange.png"));
        myList = (LinkedList<String>)myTempObject.clone();
        assertEquals(0, myList.size());
    }

    @Test
    void importJokesArrayListEmptyLines(){
        System.out.println("--- TESTING REMOVAL OF EMPTY LINES IN ARRAY LIST ---");
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> myTempObject = new ArrayList<>(ChuckBotImportJokes_Refactor.importJokesGenericList(myList, "src/test/resources/jokesemptyline.txt"));
        myList = (ArrayList<String>)myTempObject.clone();
        assertEquals(248, myList.size());
    }

    @Test
    void importJokesLinkedListEmptyLines(){
        System.out.println("--- TESTING REMOVAL OF EMPTY LINES IN LINKED LIST ---");
        LinkedList<String> myList = new LinkedList<>();
        LinkedList<String> myTempObject = new LinkedList<>(ChuckBotImportJokes_Refactor.importJokesGenericList(myList, "src/test/resources/jokesemptyline.txt"));
        myList = (LinkedList<String>)myTempObject.clone();
        assertEquals(248, myList.size());
    }

    @Test
    void importJokesFileExists(){
        System.out.println("--- TESTING WRONG FILE TYPE WITH LINKED LIST ---");
        LinkedList<String> myList = new LinkedList<>();
        LinkedList<String> myTempObject = new LinkedList<>(ChuckBotImportJokes_Refactor.importJokesGenericList(myList, "src/test/resources/xxx.txt"));
        myList = (LinkedList<String>)myTempObject.clone();
        assertEquals(0, myList.size());    }

}
