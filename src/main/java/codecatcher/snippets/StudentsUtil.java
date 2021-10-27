package codecatcher.snippets;

import java.util.Map;

public class StudentsUtil {

    public static double computeAverageScrore(Map<String, ? extends Number> studentMap){

        double score = 0;
        int count = 0;

        for (Map.Entry<String, ? extends Number> entry : studentMap.entrySet()){
            score += entry.getValue().doubleValue();
            count++;
        }

        return score/count;
    }
}
