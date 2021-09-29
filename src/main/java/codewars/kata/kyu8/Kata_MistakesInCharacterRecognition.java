package codewars.kata.kyu8;

public class Kata_MistakesInCharacterRecognition {
    public static String correct(String string) {
        //https://www.codewars.com/kata/reviews/5b8c0bfc4720c5bc95000e7c/groups/5b8c225a5921de7f0c000770
        //Create a 2D array with the replacement information
        String[][] replaceChars = { {"5", "S"},
                                    {"0", "O"},
                                    {"1", "I"}};
        //Iterate through the array and replace the characters
        for(int i = 0; i < replaceChars.length;i++){
            string = string.replaceAll(replaceChars[i][0], replaceChars[i][1]);
        }
        return string;
    }
}
