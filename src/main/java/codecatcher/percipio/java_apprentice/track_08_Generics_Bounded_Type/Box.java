package codecatcher.percipio.java_apprentice.track_08_Generics_Bounded_Type;

public class Box<T extends Comparable<T> & PrettyPrintable> implements Comparable<Box<T>>, PrettyPrintable {

    private  T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("In a box: {%s}", value);
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.value.compareTo(o.value);
    }

    @Override
    public void prettyPrint() {
        System.out.println("*--**--**--**--**--**--**--*");
        value.prettyPrint();
        System.out.println("*--**--**--**--**--**--**--*");
    }
}
