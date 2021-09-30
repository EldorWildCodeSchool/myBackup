package wildcodeschool.quests.Collection04.Map;

import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet

        Map<Hero, Flower> heroTreeMap = new TreeMap<>();
        heroTreeMap.put(hulk, lily);
        heroTreeMap.put(blackWidow, violet);
        heroTreeMap.put(captainAmerica, lily);
        heroTreeMap.put(thor, rose);
        heroTreeMap.put(vision, tulip);
        heroTreeMap.put(scarletWitch, rose);
        heroTreeMap.put(doctorStrange, violet);


        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println("Is `begonia` contained in the TreeMap? Result: " + heroTreeMap.containsValue(begonia));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for(Hero hero : heroTreeMap.keySet()){
            /*
            get(Object key):
            Params: key – the key whose associated value is to be returned
            Returns: the value to which the specified key is mapped, or null if this map contains no mapping for the key
            Remark ER: Es wird also über die Referenz des Schlüssels (Key/hero) die Referenz auf den Wert (Value/flower) geholt
            und der Variablen "flower" zugewiesen. Durch diese Referenz kann auf die Methode "getName" des Objektes des Typs Flower
            in der Iteration der for each-Schleife aufgelöst werden.
            Da musste ich doch länger drüber nachdenken, obwohl total logisch ;-)
            */
            Flower flower = heroTreeMap.get(hero);
            System.out.println(flower.getName());
        }
    }
}