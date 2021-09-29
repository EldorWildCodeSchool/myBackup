package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.comparable_comparator_on_treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main_v6 {

    public static void main(String[] args) {

        SortedSet<Product> productSet = new TreeSet<>();

        Product phone = new Product("iPhone", "Mobiles");
        Product tv = new Product("Samsung", "Electronics");
        Product jeans = new Product("Levis", "Apparel");
        Product watch = new Product("Rolex", "Accessories");

        productSet.add(phone);
        productSet.add(tv);
        productSet.add(jeans);
        productSet.add(watch);

        for (Product product : productSet) {
            System.out.println(product);
        }

        System.out.println();

        // Run
    }
}
