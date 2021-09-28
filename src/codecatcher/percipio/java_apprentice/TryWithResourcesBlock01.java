package codecatcher.percipio.java_apprentice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesBlock01 {
        public static void main(String[] args) {

            BufferedReader br = null;
            try {
                File file = new File("data/myFile.txt");
                br = new BufferedReader(new FileReader(file));
                String st = br.readLine();

                while (st != null) {
                    System.out.println(st);

                    st = br.readLine();
                }
            }
            catch (IOException ex) {
                System.out.println("Exception caught: " + ex);
            }
            finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Closed the buffered reader in the finally block");
                } else {
                    System.out.println("The buffered reader was never opened");
                }
            }
        }
    }
