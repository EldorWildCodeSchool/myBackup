package codecatcher.snippets.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams01 {

    // https://odyssey.wildcodeschool.com/quests/548
    public static void main(String[] args) {


        List<Integer> listFiltered = filter(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6)), new Keep() {
            @Override
            public boolean test(Integer item) {
                return item % 2 == 0;
            }
        });
        System.out.println("With own created functional interface Keep: "  + listFiltered);


        List<Integer> listFilteredPredicate = filterPredicate(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6)), new Predicate<Integer>() {

            @Override
            public boolean test(Integer item) {
                return item % 2 == 0;
            }
        });
        System.out.println("With Java8 functional interface Predicate: "  + listFilteredPredicate);


        List<Integer> listeFilteredPredicateLampda = filterPredicate(new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6)), item -> item % 2 == 0);
        System.out.println("With Java8 functional interface Predicate addressed with Lampda Expression: "  + listeFilteredPredicateLampda);


        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6));
        List<Integer> streamList = list.stream()
                .filter(item -> item % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("With Java8 streams, lambda expression and functional interface Predicate: "  + streamList);

    }


    //Methods
    private static List<Integer> filter(List<Integer> list, Keep keep) {
        List<Integer> listFiltered = new ArrayList<>();
           for(Integer item : list){
            if (keep.test(item)){
                listFiltered.add(item);
            }
        }
        return listFiltered;
    }


    private static List<Integer> filterPredicate(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> listFiltered = new ArrayList<>();
        for(Integer item : list){
            if (predicate.test(item)){
                listFiltered.add(item);
            }
        }
        return listFiltered;
    }
}
