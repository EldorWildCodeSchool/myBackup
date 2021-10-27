package wildcodeschool.project.chuckbot.week2;

import java.util.List;

public interface JokesPersistence {

    // Method has to be implemented to import a list of jokes and their creation date from a defined file as Joke-objects into a list
    List<Joke> loadData();

    // Method has to be implemented to export objects of type Joke from a list to a specific file
    void storeData(List<Joke> jokes);

}
