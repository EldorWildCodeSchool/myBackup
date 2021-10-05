package codecatcher.percipio.java_apprentice.Lab.TreeSet_TreMap_Comparator_03;

import java.util.*;
class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
public class Treemapcomp {
    public static void main(String[] args) {
        TreeMap<String, String> NameMap = new TreeMap<String, String>(new MyComparator());
        NameMap.put("5", "George");
        NameMap.put("1", "Rita");
        NameMap.put("3", "Christina");
        NameMap.put("4", "Franklin");
        NameMap.put("2", "Antony");
        System.out.println("TreeMap sorted in descending order based on keys: \n"+NameMap+ "\n");
    }
}
