package wildcodeschool.dojos.dojo_20210920;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        // User Story: As a user, I want to see the discount I get on a new product.

        // 1. Create classes and class dependencies as described in the diagram
        // * All Kunden have IDs, names and email addresses.
        // * The following types of Kunden exists: StandardKunde, ExklusivKunde, VIKunde
        // * All Kunden implement a berechneRabatt(int wert) method, which calculates and returns the discount depending on the type of Kunde
        // * The type of Kunde is determined by the file the data is stored (standard/exklusiv/vi)

        // 2. Read StandardKunden from new File("src/test/resources/kunden_standard.csv").

        File inputStandardKunden = new File("src/test/resources/kunden_standard.csv");
        File inputExklusivKunden = new File("src/test/resources/kunden_exklusiv.csv");
        File inputVIKunden = new File("src/test/resources/kunden_vi.csv");
        List<String> standardKunden = Files.readAllLines(inputStandardKunden.toPath()).stream().skip(1).collect(Collectors.toList());
        List<String> exklusivKunden = Files.readAllLines(inputExklusivKunden.toPath());
        List<String> viKunden = Files.readAllLines(inputVIKunden.toPath());

        // 3. Read ExklusivKunden from new File("src/test/resources/kunden_exklusiv.csv").
        // 4. Read VIKunden from new File("src/test/resources/kunden_vi.csv").

        // 5. For each file: Split each line into a String array, use the correct separator string ","
        List<Kunde> kunden = new ArrayList<>();
        for(int i = 1; i < standardKunden.size(); i++){
            String[] temp = standardKunden.get(i).split(",");
            StandardKunde standardKunde = new StandardKunde(temp[0], temp[1], temp[2]);
            kunden.add(standardKunde);
        }
        for(int i = 1; i < exklusivKunden.size(); i++){
            String[] temp = exklusivKunden.get(i).split(",");
            ExklusivKunde exklusivKunde = new ExklusivKunde(temp[0], temp[1], temp[2]);
            kunden.add(exklusivKunde);
        }
        for(int i = 0; i < viKunden.size(); i++){
            String[] temp = viKunden.get(i).split(",");
            VIKunde viKunde = new VIKunde(temp[0], temp[1], temp[2]);
            kunden.add(viKunde);
        }
        /*
        for (String lineInList : standardKunden) {
            String[] listStandardKunden = lineInList.split(",");
            if(!listStandardKunden[0].equals("alphanumeric")) {
                StandardKunde standardKunde = new StandardKunde(listStandardKunden[0], listStandardKunden[1], listStandardKunden[2]);
            }
        }*/

        for (Kunde kunde: kunden) {
            kunde.berechneRabatt(1000);
        }

        // 6. For each line: Convert each line into an object of the correct type of Kunde, which already has a suitable constructor (id,name,email)

        // 7. Add all Kunde objects to a new List<Kunde>

        // 8. For all Kunden, print the String: "I am Kunde NAME with Id ID and a will pay only WERT-RABATT euros for the new product!"
    }

    /*
     * Advanced Version with Reflection
     * Can create all kind of Kunden, eg.
     *
     * List<Kunde> kunden = addKunden(standardKunden, StandardKunde.class);
     * kunden.addAll(addKunden(exklusivKunden, ExklusivKunden.class)
     * kunden.addAll(addKunden(viKunden, ViKunden.class)
     *
     */
    public static List<Kunde> addKunden(List<String> kundenImport, Class clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Kunde> kunden = new ArrayList<>();
        for(int i = 1; i < kundenImport.size(); i++){
            String[] temp = kundenImport.get(i).split(",");
            Kunde kunde = (Kunde) clazz.getDeclaredConstructor(String.class, String.class, String.class).newInstance(temp[0], temp[1], temp[2]);
            kunden.add(kunde);
        }
        return kunden;
    }
}