package codewars.kata.kyu8;
import java.util.stream.IntStream;

public class Kata_WhatisInBetween {

    //https://www.codewars.com/kata/reviews/6057a856f2a8e50001a72b44/groups/6057a856f2a8e50001a72b48
    public static int[] bestPracticeBetween(int a, int b) {
        return IntStream.rangeClosed(a,b).toArray();
    }

    //MySolution
    public static int[] mySolutionBetween(int a, int b) {

        int myStartValue = a;
        int myArraySize = 0;

        while (myStartValue <= b){
            myArraySize++;
            myStartValue++;
        }

        int myArray[] = new int[myArraySize];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = a;
            a++;
        }
        return myArray;
    }
}