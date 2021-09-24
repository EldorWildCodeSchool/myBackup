package codewars.kata.kyu8;

public class Kata_TripleTrouble {

    //https://www.codewars.com/kata/reviews/570c4d03d9b5779a7e00004b/groups/57192ea1efda33037c000010
    public static String tripleTroubleBestPractive(String s1, String s2, String s3) {
        StringBuilder sb = new StringBuilder(s1.length()*3);
        for (int i=0; i<s1.length(); i++) {
            sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
        }
        return sb.toString();
    }

    //Meine Lösung
    public static String tripleTrouble(String one, String two, String three) {
        // Solution
        int sLength = one.length();
        int i = 0;
        String result = "";
        while(i < sLength){
            result = result + one.charAt(i) + two.charAt(i) + three.charAt(i);
            i++;
        }
     return result;
    }
}
