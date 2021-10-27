package wildcodeschool.project.chuckbot.week2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class JokesFilePersistence implements JokesPersistence {

    private File storage;

    public JokesFilePersistence(File storage) {
        this.storage = storage;
    }

    @Override
    public List<Joke> loadData() {

        // Check whether the  file exists or not, and in case not, return empty list
        File in = this.storage;
        if (!in.exists()) {
            System.err.println("Tried to import jokes but no valid path or input file exists");
            return new LinkedList<>();
        }

        // Create the LinkedList to be returned if everything went well
        List<Joke> currJokeList = new LinkedList<>();

        // Try to import strings from file and create joke objects, in case the joke isn't an empty value
        try {
            //Import all jokes to a list to split the values contained in each line and iterate over the entries afterwards
            List<String> jokesImportList = Files.readAllLines(in.toPath());
            for (String currJokeString : jokesImportList) {
                String[] jokesDataArr = currJokeString.split(";");
                // Only create a joke object, if the joke value isn't empty
                if (!jokesDataArr[0].isEmpty()) {
                    currJokeList.add(new Joke(jokesDataArr[0], LocalDate.parse(jokesDataArr[1])));
                }
            }
            // Check, whether there were some joke objects created or not. In case not, return empty list
            if (currJokeList.isEmpty()) {
                System.err.println("Tried to import jokes but no strings in input file found");
                return new LinkedList<>();
            }
        } catch (MalformedInputException e) {
            System.err.println("Tried to import jokes but file has a wrong file type.");
            return new LinkedList<>();
        } catch (IOException e) {
            System.err.println("Tried to import jokes but something went terribly wrong (this is no joke!)");
            return new LinkedList<>();
        }

        // everything went well so far, so returning the list with jokes
        System.out.println("Jokes where successfully imported");
        return currJokeList;
    }

    @Override
    public void storeData(List<Joke> jokes) {

        // Write the list to a file, whereby the file is always regenerated
        Path out = this.storage.toPath();
        try (BufferedWriter writer = Files.newBufferedWriter(out, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {
            for (Joke currJoke : jokes) {
                writer.append(currJoke.serializedCSV());
            }
        } catch (IOException e) {
            System.err.println("Tried to export jokes but something went terribly wrong (this is no joke!)");
        }
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            File fileFromArgs = new File(args[0]);
            JokesPersistence jokesPersistence = new JokesFilePersistence(fileFromArgs);
            List<Joke> importedJokeList =  jokesPersistence.loadData();
            System.out.println("--- HERE COMES THE LIST OF IMPORTED JOKES ---");
            for(Joke currJoke : importedJokeList){
                System.out.println(currJoke.getJoke() + " --- " + currJoke.getDateCreated());
            }
        }
        else{
            File fileFromString = new File("src/test/resources/week2_jokes.txt");
            JokesPersistence jokesPersistence = new JokesFilePersistence(fileFromString);
            List<Joke> importedJokeList =  jokesPersistence.loadData();
            System.out.println("--- HERE COMES THE LIST OF IMPORTED JOKES ---");
            for(Joke currJoke : importedJokeList){
                System.out.println(currJoke.getJoke() + " --- " + currJoke.getDateCreated());
            }
            Joke myFirstJoke = new Joke("Chuck Norris wurde gestern geblitzt – beim Einparken.", LocalDate.now());
            importedJokeList.add(myFirstJoke);
            System.out.println("\n--- ADDED NEW JOKE TO THE LIST --- THIS JOKE WILL BE IMPORTED DURING THE NEXT RUN ---");
            System.out.println(myFirstJoke.serializedCSV());
            jokesPersistence.storeData(importedJokeList);
        }
    }
}
