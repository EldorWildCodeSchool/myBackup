package codewars.kata.kyu8;

import java.util.Arrays;

public class Kata_DifferenceOfVolumesOfCuboids {

    // https://www.codewars.com/kata/58cb43f4256836ed95000f97/solutions/java
    static int findDifferenceBestPractice(int[] a, int[] b) {
        return Math.abs(a[0] * a[1] * a[2] - b[0] * b[1] * b[2]);
    }


    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int a = arrCalc(firstCuboid);
        int b = arrCalc(secondCuboid);

        if (a >= b){
            return a - b;
        } else{
            return b - a;
        }
    }

    private static int arrCalc(int[] arrCuboid) {
        int result = 0;
        for(int arrCube : arrCuboid){
            if (result == 0){
                result = arrCube;
            } else{
            result = result * arrCube;}
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{2, 2, 3}, new int[]{5, 4, 1}));
        System.out.println(findDifferenceBestPractice(new int[]{2, 2, 3}, new int[]{5, 4, 1}));
    }
}
