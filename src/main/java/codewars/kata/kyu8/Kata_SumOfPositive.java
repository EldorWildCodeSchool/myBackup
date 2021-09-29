package codewars.kata.kyu8;

import java.util.stream.IntStream;

public class Kata_SumOfPositive {

    //https://www.codewars.com/kata/reviews/5aea4cf1ed8a9783ad0005fe/groups/5aea6262ed8a97a5fe0006cd
    public static int sumbestpractice(int[] arr) {
        return IntStream.of(arr).filter(x -> x > 0).sum();
    }


    //My Solution
    public static int sum(int[] arr){
        int mySum = 0;
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] > 0){
             mySum += arr[i];
            }
        }
        return mySum;
    }
}
