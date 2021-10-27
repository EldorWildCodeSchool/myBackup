package wildcodeschool.project.chuckbot.week2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class ChuckNorrisJokeService {

    private JokesFilePersistence persistence;
    private List<Joke> listOfImportedJokes;

    //TODO: Wie war das? Innerhalb einer Klasse wird auch über die Getter auf die Variablen zugegriffen?
    //TODO: "The main method should handle everything by using the new Service"? Wozu eine Main-Method, wenn dies bloß ein Service ist?

    // Constructor
    public ChuckNorrisJokeService(JokesFilePersistence persistence){
        this.persistence = persistence;
    }

    // Load the persistet jokes into the list
    public void initialize(){
        listOfImportedJokes = persistence.loadData();
    }

    // Print all jokes which are on the list
    public void printAllJokes(){
        for (Joke currJoke : listOfImportedJokes) {
            System.out.println(currJoke.getJoke());
        }
    }

    // TODO: HIer kannste nochmal mit dem Comparator und Comparable üben (ist wieder nix hängen geblieben)
    // Find and print the newest joke from the list by creationDate
    public void getNewestJoke(){
        listOfImportedJokes.sort(Comparator.comparing(Joke::getDateCreated).reversed());
        System.out.println(listOfImportedJokes.get(0).getJoke());
    }

    // Add a new Joke to the list (but don't persist it)
    public void addNewJoke(Joke newJoke){
        listOfImportedJokes.add(newJoke);
    }

    // Add a new Joke to the list, which is just defined by the joke text (but don't persist it)
    public void addNewJoke(String newJokeText){
        Joke newJoke = new Joke(newJokeText, LocalDate.now());
        listOfImportedJokes.add(newJoke);
    }

    // Persist all Jokes
    public void shutdown(){
        persistence.storeData(listOfImportedJokes);
    }
}