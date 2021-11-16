package codecatcher.snippets.streams.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Streams02 {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Kari", "Parmentier"),
                new Person("Gerard", "Laurent"),
                new Person("Apollone", "Truchon")
        ));

        List<String> listMapped = new ArrayList<>();
        for(Person person : list){
            listMapped.add(person.getFirstName() + " " + person.getLastName());
        }
        System.out.println(listMapped);


        listMapped = map(list);
        System.out.println(listMapped);


        listMapped = mapConcat(list, new Concat() {
            @Override
            public String apply(Person person) {
                return person.getFirstName() + " " + person.getLastName();
            }
        });
        System.out.println(listMapped);


        listMapped = mapConcat(list, person -> person.getFirstName() + " " + person.getLastName());
        System.out.println(listMapped);


        listMapped = mapConcatFunction(list, new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.getFirstName() + " " + person.getLastName();
            }
        });
        System.out.println(listMapped);


        listMapped = mapConcatFunction(list, person -> person.getFirstName() + " " + person.getLastName());
        System.out.println(listMapped);

    }


    // Methods
    private static List<String> map (List<Person> list){
        List<String> listMapped = new ArrayList<>();
        for (Person person : list){
            listMapped.add(person.getFirstName() + " " + person.getLastName());
        }
        return listMapped;
    }

    private static List<String> mapConcat (List<Person> list, Concat concat){
        List<String> listMapped = new ArrayList<>();
        for (Person person : list){
            listMapped.add(concat.apply(person));
        }
        return listMapped;
    }

        private static List<String> mapConcatFunction (List<Person> list, Function<Person, String> concat){
            List<String> listMapped = new ArrayList<>();
            for (Person person : list){
                listMapped.add(concat.apply(person));
            }
            return listMapped;
    }
}
