package wildcodeschool.dojos.dojo_20210920;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Path standardKdPath = Paths.get("src/test/ressources/kunden_standard.csv");
        Path exklusivdKdPath = Paths.get("src/test/ressources/kunden_exklusiv.csv");
        Path viKdPath = Paths.get("src/test/ressources/kunden_vi.csv");

        List<String> standardKundenList = Files.readAllLines(standardKdPath);
        List<String> exklusivList = Files.readAllLines(exklusivdKdPath);
        List<String> viKundenList = Files.readAllLines(viKdPath);

        List<Kunde> kundenListe = new ArrayList<>();
        for (String kundeAttributeList : standardKundenList.subList(1, standardKundenList.size()-1)){
            String[] kundenDataArr = kundeAttributeList.split(",");
            kundenListe.add(new StandardKunde(kundenDataArr[0], kundenDataArr[1], kundenDataArr[2]));
        }
        for (String kundeAttributeList : exklusivList.subList(1, exklusivList.size()-1)){
            String[] kundenDataArr = kundeAttributeList.split(",");
            kundenListe.add(new ExklusivKunde(kundenDataArr[0], kundenDataArr[1], kundenDataArr[2]));
        }
        for (String kundeAttributeList : viKundenList) {
            String[] kundenDataArr = kundeAttributeList.split(",");
            kundenListe.add(new VIKunde(kundenDataArr[0], kundenDataArr[1], kundenDataArr[2]));
        }


        for (Kunde meinKunde: kundenListe) {
            System.out.printf("%i", meinKunde.berechneRabatt(1000));
        }

    }

}
