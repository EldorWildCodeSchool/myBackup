package wildcodeschool.quests.Collection02.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));
        heroes.add(new Hero("EO", 50));
        heroes.add(new Hero("Party Beast from Bielefeld", 50));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        Collections.sort(heroes);
        //Collections.sort(heroes, Collections.reverseOrder());
        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        // TODO TOLEARN - LINK: https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#comparing-java.util.function.Function-
        // TODO TOLEARN - LINK: https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#reversed--
        // Implemented, after I've seen Christianes solution
        Comparator compSortHeroesReverse = new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                // Compare should return for reversed sorting:
                //   0: if (o2.getAge() == o1.getAge()) - values can keep place
                //  <0: if (o2.getAge() < o1.getAge)    - o2 should be sorted behind o1
                //  >0: if (o2.getAge() > o1.getAge)    - o2 should be sorted in front of o2
                return o2.getAge() - o1.getAge();
            }
        };

        Collections.sort(heroes, compSortHeroesReverse);
        //heroes.sort(Comparator.comparing(Hero::getAge).reversed());
        System.out.println("\nOrder by age (descending):");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}