package wildcodeschool.project.chuckbot.week1;



import wildcodeschool.project.chuckbot.util.ChuckPrint;

import java.util.Set;

public class ChuckBotStarter {

    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("print")) {
            Set<String> importedJokes = ChuckBotImportJokes.importJokes("src/test/resources/jokes.txt");
            JokeHandler.addingNewJoke();

            ChuckPrint.printAllJokesAtStart(importedJokes);
        }
    }

}
