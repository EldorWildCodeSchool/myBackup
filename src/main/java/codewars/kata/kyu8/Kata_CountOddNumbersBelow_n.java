package codewars.kata.kyu8;

public class Kata_CountOddNumbersBelow_n {

    // https://www.codewars.com/kata/59342039eb450e39970000a6/solutions
    //best practice from kata
    public static int oddCountBestPractice(int n){
        return n/2;
    }

    // with ternary operator
    public static int oddCount(int n){
        int result = 0;
        while(n >= 1){
            result = ((n-1) %2 != 0) ? ++result : result;
            n--;
        }
        return result;
    }

    //with naive code
    public static int oddCount2(int n){
        int result = 0;
        while(n >= 1){
            if((n-1) %2 != 0){
                result++;
            }
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(oddCount(150));
    }

}
