package wildcodeschool.quests.Collection01.List;

import wildcodeschool.quests.Collection01.List.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

        List<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));
        heroes.add(new Hero("EO", 50));

        System.out.println("--- FRESH LIST WITH ALL PETS OF THANATOS ---");
        extracted(heroes);


        // TODO 3 : It's Thor birthday, now he's 1501
        for (Hero toBeFound : heroes){
            if(toBeFound.getName().equals("Thor")){
                toBeFound.setAge(1501);
            }
        }
        System.out.println("--- LIST WITH AN OLDER THOR ---");
        extracted(heroes);


        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        System.out.println("--- SHUFFLED LIST ---");
        extracted(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> subHeroes = heroes.subList(0, heroes.size()/2);
        System.out.println("--- HALF THE LIST, ERASED BY THANATOS  *SNIP SNIP*---");
        extracted(subHeroes);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println("--- REST OF THE LIST ---");
        for (int i = heroes.size()/2; i < heroes.size(); i++) {
            heroes.get(i).printMyHero();
        }
        System.out.println();

        // TODO X: Frestyle: Sort the list by name of the heroes with lambda expression
        heroes.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("--- SORTED LIST---");
        extracted(heroes);
    }

    private static void extracted(List<Hero> heroes) {
        for (Hero toBePrinted : heroes) {
            toBePrinted.printMyHero();
        }
        System.out.println();
    }
}