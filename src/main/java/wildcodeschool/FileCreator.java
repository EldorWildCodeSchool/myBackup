package wildcodeschool;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileCreator {

    public static void main(String[] args) {
        
        String[] myDataArr = new String[10000];
        for (int i = 0; i < myDataArr.length; i++){
            myDataArr[i] = "IchBinEinString_" + i;
        }
        
        Path out = Paths.get("src/test/resources/10k_large.csv");
        try (BufferedWriter writer = Files.newBufferedWriter(out, StandardCharsets.UTF_8, StandardOpenOption.TRUNCATE_EXISTING)) {
            System.out.println(myDataArr.length);
            int count = 0;
            for (String data : myDataArr) {
                writer.append(String.valueOf(count)).append(",").append(data).append(System.lineSeparator());
                System.out.println(count + "," + data + System.lineSeparator());
                count++;
            }
        } catch(IOException e){
            e.printStackTrace();
        }

        Path in = Paths.get("src/test/resources/10k_large.csv");
        try {
            List<String> myDataList = Files.readAllLines(in);
            for (String data : myDataList) {
                System.out.println(data);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
