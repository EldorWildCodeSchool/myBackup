package wildcodeschool.quests.Collection04.Map_MapHelperClass;

import java.util.Map;

public class MapHelper {

    //  Generic helper-method to add entries from two arrays to a map where one arrays offers the key,
    //  while the other arrays offers the value
    public static <H, F> void addEntriesClassMethod(Map<H, F> map, H[] keys, F[] values){
        int index = 0;
        for(H key : keys){
            map.put(key, values[index]);
            index++;
        }
    }

}
