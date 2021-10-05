package codecatcher.percipio.java_apprentice.Lab.TreeSet_TreMap_Comparator_03;
import java.util.TreeSet;

class Hero implements Comparable<Hero>{
    public String name;
    public Hero(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Hero h) {
        return this.name.compareTo(h.name);
    }

    @Override
    public String toString(){
        return this.name;
    }
}

public class LabTreeSetComparable {
    public static void main(String[] args) {
        TreeSet<Hero> myHeroes = new TreeSet<>();
        Hero hero_1 = new Hero("Thor");
        Hero hero_2 = new Hero("Hulk");
        Hero hero_3 = new Hero("Vision");
        Hero hero_4 = new Hero("Black Widow");
        myHeroes.add(hero_1);
        myHeroes.add(hero_2);
        myHeroes.add(hero_3);
        myHeroes.add(hero_4);
        System.out.println("These are my heroes: " + myHeroes);
    }
}
