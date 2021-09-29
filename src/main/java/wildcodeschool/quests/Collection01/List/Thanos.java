package wildcodeschool.quests.Collection01.List;

import wildcodeschool.quests.Collection01.List.Hero;

import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

        // Instantiate list heroes as an array list
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
        // Add values to the list
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));
        heroes.add(new Hero("EO", 50));
        heroes.add(new Hero("Baileys lovin' Queen Qf Qode", 29));

        System.out.println("--- FRESH LIST WITH ALL PETS OF THANATOS ---");
        printHeroes(heroes);


        // TODO 3 : It's Thor birthday, now he's 1501
        for (Hero toBeFound : heroes){
            if(toBeFound.getName().equals("Thor")){
                toBeFound.setAge(1501);
            }
        }
        System.out.println("--- LIST WITH AN OLDER THOR ---");
        printHeroes(heroes);


        // TODO 4 : Shuffle the heroes list
        shuffleHeroes(heroes);
        System.out.println("--- SHUFFLED LIST ---");
        printHeroes(heroes);


        // TODO 5 : Keep only the half of the list
        //List<Hero> subHeroes = eraseHeroes(heroes);
        System.out.println("--- THESE HEROES (HALF THE LIST), HAVE BEEN ERASED BY THANATOS  *SNIP SNIP*---");
        List<Hero> heroesErased = new ArrayList<Hero>();
        heroesErased = heroes.subList(0, heroes.size()/2);
        printHeroes(heroesErased);
        heroes.subList(0, heroes.size()/2).clear();
        //printHeroes(heroes);


        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println("--- REST OF THE LIST ---");
        for (int i = 0; i < heroes.size(); i++) {
            heroes.get(i).printMyHero();
        }
        System.out.println();


        // TODO X: Frestyle: Sort the list by name of the heroes
        heroes.sort(Comparator.comparing(Hero::getName));
        //heroes.sort(Comparator.comparing(Hero::getAge));
        System.out.println("--- SORTED LIST---");
        printHeroes(heroes);
    }

    //Helper methods
    private static void shuffleHeroes(List<Hero> heroes) {
        Collections.shuffle(heroes);
    }

    private static void printHeroes(List<Hero> heroes) {
        for (Hero toBePrinted : heroes) {
            toBePrinted.printMyHero();
        }
        System.out.println();
    }
}