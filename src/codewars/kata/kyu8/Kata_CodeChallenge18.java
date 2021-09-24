package codewars.kata.kyu8;

public class Kata_CodeChallenge18 {

    // https://www.codewars.com/kata/reviews/5b20e0f40b64ba51330023b8/groups/5b211214fe13d5ae8b0024c3
    // Best practice with Lampda
    // https://www.baeldung.com/java-count-chars
    public static int strCount(String str, char letter) {
        int count = 0;
        if(str.length() != 0) {
            count = (int) str.chars().filter(booboo -> booboo == letter).count();
            return count;
        }
        return count;
    }

    //my naive solution
    public static int strCount2(String str, char letter){
        int count = 0;
        if(str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == letter) {
                    count++;
                }
            }
            return count;
        }
        return count;
    }
}
