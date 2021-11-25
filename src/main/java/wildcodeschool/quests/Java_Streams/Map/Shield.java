package wildcodeschool.quests.Java_Streams.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        // Variante 1
        // Inspiriert bei Armans-Lösung
        List<Agent> agents = names.stream()
                     .map(name -> name.split(" "))                                  // erzeugt einen Array vom Typ String mit zwei Einträgen
                     .map(splitString -> new Agent(splitString[0], splitString[1]))       // erzeugt ein neues Agent-Objekt mit den Werten aus dem String-Array
                     .collect(Collectors.toList());



        // Variante 2
        // Dies war meine Idee zu "3. Use a Function in which you can call the methodsplit on the string to extract the first and last name:
        // use these to create an instance of an Agent and return it"
        List<Agent> agents2 = names.stream()
                        .map(name -> {
                            Agent agentX = new Agent();
                            agentX.setFirstName(name.split(" ")[0]);
                            agentX.setLastName((name.split(" ")[1]));
                            return agentX;
                        })
                .collect(Collectors.toList());

        showAgents(agents);
        showAgents(agents2);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}