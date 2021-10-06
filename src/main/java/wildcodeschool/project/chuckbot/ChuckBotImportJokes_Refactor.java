package wildcodeschool.project.chuckbot;

import java.io.File;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ChuckBotImportJokes_Refactor {


    public static Set<String> importJokes(String pfad) {

        //created data structure
        File inputFile = new File(pfad);
        Set<String> jokeList = new HashSet<>();

        //check if file exists
        if (inputFile.exists()) {

            try {
                //read file into List
                List<String> inputList = Files.readAllLines(inputFile.toPath());

                if (!inputList.isEmpty()) {

                    //add List into HashSet
                    for (String s : inputList) {
                        //check if Strings are empty or null
                        if (!s.isBlank() || !s.isEmpty()) {
                            jokeList.add(s);
                        }

                    }
                    System.out.println("import successful");

                } else {
                    System.out.println("File is empty. Couldn't import!");
                    return null;
                }

            } catch (MalformedInputException e) {
                System.err.println("wrong file type!");
                return null;

            } catch (IOException e) {
                System.err.println("import error!");
                return null;
            }

            return jokeList;

        } else {
            System.err.println("import error");
            return null;
        }

    }

    public static List<String> importJokesGenericList(List<String> interfaceList, String path) {

        // create file path from string "path"
        File inputFile = new File(path);

        // check if file exists and in case not, return empty list
        if (!inputFile.exists()) {
            System.err.println("Tried to import jokes but no valid path or input file exist in:" + path);
            return interfaceList;
        }

        // try to import strings from file
        try {
            //read file as a whole into List
            interfaceList = Files.readAllLines(inputFile.toPath());

            // if interface list is still empty after import attempt return an empty list
            if (interfaceList.isEmpty()) {
                System.err.println("Tried to import jokes but no strings in input file found");
                return interfaceList;
            }

            // remove empty lines from list
            interfaceList.removeIf(String::isEmpty);

        } catch (MalformedInputException e) {
            System.err.println("Tried to import jokes but file has a wrong file type: " + path);
            return interfaceList;
        } catch (IOException e) {
            System.err.println("Tried to import jokes but something went terribly wrong (this is no joke!)");
            return interfaceList;
        }
        // everything went well so far, so returning the list with jokes
        System.out.println("Jokes where successfully imported");
        return interfaceList;
    }
}