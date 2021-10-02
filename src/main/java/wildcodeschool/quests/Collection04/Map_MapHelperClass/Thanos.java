package wildcodeschool.quests.Collection04.Map_MapHelperClass;

import java.util.HashMap;
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
        Map<Hero, Flower> party = new TreeMap<>();

        // Instantiate two arrays (hero objects as keys, flower objects as values) to be added to the map 'party'
        Hero[] heroArr = {hulk, thor, scarletWitch,vision,captainAmerica,doctorStrange,blackWidow};
        Flower[] flowerArr = {rose, rose, rose, tulip,lily,violet,violet};

        // Add all entries of the two arrays to the map 'party' with a helper-method
        // 1. from a static method in class MapHelper
        // 2. from a static method within this class
        // MapHelper.addEntriesClassMethod(party, heroArr, flowerArr);
        addEntriesLocalMethod(party, heroArr, flowerArr);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println("Is `begonia` contained in the TreeMap? \t Result: " + party.containsValue(begonia));
        System.out.println("Is `rose` contained in the TreeMap? \t Result: " + party.containsValue(rose));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        // Iterate over a set of the key-values (of type Hero) of the map "party"
        for(Hero hero : party.keySet()){
            /*
            get(Object key):
            Params: key – the key whose associated value is to be returned
            Returns: the value to which the specified key is mapped, or null if this map contains no mapping for the key
            Remark ER: Es wird also über die Referenz des Schlüssels (Key/hero) die Referenz auf den Wert (Value/flower) geholt
            und der Variablen "flower" zugewiesen. Durch diese Referenz kann auf die Methode "getName" des Objektes des Typs Flower
            in der Iteration der for each-Schleife aufgelöst werden.
            Da musste ich doch länger drüber nachdenken, obwohl total logisch. Dem Debugger sei Dank ;-)
            */
            Flower flower = party.get(hero);
            System.out.println(flower.getName() + "\t (belongs to " + hero.getName() + ")");
        }
    }

    //  Generic helper-method to add entries from two arrays to a map where one arrays offers the key,
    //  while the other arrays offers the value
    public static <H, F> void addEntriesLocalMethod(Map<H, F> map,H[] keys, F[] values){
        int index = 0;
        for(H key : keys){
            map.put(key, values[index]);
            index++;
        }
    }
}