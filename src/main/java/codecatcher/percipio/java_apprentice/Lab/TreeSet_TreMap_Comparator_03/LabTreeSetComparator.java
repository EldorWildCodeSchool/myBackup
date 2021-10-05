package codecatcher.percipio.java_apprentice.Lab.TreeSet_TreMap_Comparator_03;
import java.util.Comparator;
import java.util.TreeSet;

class myCompClass implements Comparator<String> {
    public int compare(String c1, String c2){
        return c1.compareTo(c2);
    }
}

public class LabTreeSetComparator {

    public static void main(String[] args) {

        TreeSet<String> myTreeSet = new TreeSet<String>(new myCompClass());
        myTreeSet.add("Thor");
        myTreeSet.add("Hulk");
        myTreeSet.add("Vision");
        System.out.println("These are my heroes: " + myTreeSet);
    }
}
