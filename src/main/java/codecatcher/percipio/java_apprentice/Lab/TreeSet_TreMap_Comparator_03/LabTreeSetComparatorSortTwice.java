package codecatcher.percipio.java_apprentice.Lab.TreeSet_TreMap_Comparator_03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

// Class to define the NewHero-object
class NewHero{
    public String name;
    public int age;

    public NewHero(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return ("--- " + this.name + ", age " + this.age + " --- ");
    }
}

// Class as a comparator to sort NewHeros by name
class myHeroNameComparator implements Comparator<NewHero>{
    @Override
    public int compare(NewHero o1, NewHero o2) {
        return o1.name.compareTo(o2.name);
    }
}

// Class as a comparator to sort NewHeros by age
class myHeroAgeComparator implements Comparator<NewHero>{
    @Override
    public int compare(NewHero o1, NewHero o2) {
        return o1.age - o2.age;
    }
}

// Let the magic happen ...
public class LabTreeSetComparatorSortTwice {

    public static void main(String[] args) {

        // Instantiating NewHero-objects and adding them to an array of type NewHero
        NewHero hero_1 = new NewHero("Thor", 1500);
        NewHero hero_2 = new NewHero("Hulk", 49);
        NewHero hero_3 = new NewHero("Vision", 3);
        NewHero hero_4 = new NewHero("Black Widow", 29);
        NewHero[] newHeroArr = {hero_1, hero_2, hero_3, hero_4};

        // Instantiating a new TreeSet of type NewHero, standard sorting by the comparator defined in class myHeroNameComparator
        // Also adding the entries of the array to the TreeSet
        TreeSet<NewHero> heroesByName = new TreeSet<NewHero>(new myHeroNameComparator());
        heroesByName.addAll(Arrays.asList(newHeroArr));

        //Output the by name sorted TreeSet in two variants
        System.out.println("HEROES SORTED WITH COMPARATOR/COMPARE BY NAME: " + heroesByName);
        System.out.println("\nHEROES SORTED WITH COMPARATOR/COMPARE BY NAME: ");
        for( NewHero hero : heroesByName){
            System.out.println(hero.name);
        }
        System.out.println("");

        // Instantiating a new TreeSet of type NewHero, standard sorting by the comparator defined in class myHeroAgeComparator
        // Also adding the entries of the array to the TreeSet
        TreeSet<NewHero> heroesByAge = new TreeSet<NewHero>(new myHeroAgeComparator());
        heroesByAge.addAll(Arrays.asList(newHeroArr));

        //Output the by age sorted TreeSet in two variants
        System.out.println("HEROES SORTED WITH COMPARATOR/COMPARE BY AGE: " + heroesByAge);
        System.out.println("\nHEROES SORTED WITH COMPARATOR/COMPARE BY AGE: ");
        for( NewHero hero : heroesByAge){
            System.out.println(hero.name);
        }
        System.out.println("");
    }
}
