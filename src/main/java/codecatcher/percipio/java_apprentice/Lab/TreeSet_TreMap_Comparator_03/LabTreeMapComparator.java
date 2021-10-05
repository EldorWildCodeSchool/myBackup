package codecatcher.percipio.java_apprentice.Lab.TreeSet_TreMap_Comparator_03;

import java.util.Comparator;
import java.util.TreeMap;

class VeryNewHero {
    public String name;
    public VeryNewHero(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

class myDescHeroKeyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

public class LabTreeMapComparator {

    public static void main(String[] args) {
        VeryNewHero hero_1 = new VeryNewHero("Thor");
        VeryNewHero hero_2 = new VeryNewHero("Hulk");
        VeryNewHero hero_3 = new VeryNewHero("Vision");
        VeryNewHero hero_4 = new VeryNewHero("Black Widow");
        VeryNewHero[] newHeroArr = {hero_1, hero_2, hero_3, hero_4};

        TreeMap<Integer, VeryNewHero>  myHeroes = new TreeMap<>(new myDescHeroKeyComparator());
        for(int i = 0; i < newHeroArr.length; i++){
            Integer y = i + 1;
            myHeroes.put(y, newHeroArr[i]);
        }
        System.out.println(myHeroes);
    }
}
