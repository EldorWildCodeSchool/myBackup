package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.comparable_comparator_on_treeset;

import java.util.Objects;

public class Product_v2 implements Comparable<Product_v2> {

    private String name;
    private String category;

    public Product_v2(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("\n{name=%s, category=%s}", name, category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!(other instanceof Product)) {
            return false;
        }

        Product_v2 otherProduct = (Product_v2) other;

        if (otherProduct.name.equals(this.name) &&
                otherProduct.category.equals(this.category)) {
            return true;
        }

        return false;
    }

    @Override
    public int compareTo(Product_v2 o) {

        int compareName = this.name.compareTo(o.name);

        if (compareName != 0) {
            return compareName;
        }

        return this.category.compareTo(o.category);
    }
}
