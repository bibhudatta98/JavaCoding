package com.java.Streams;

public class FindSecondHighestValueInArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 45, 32, 45, 18};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no second highest value.");
        } else {
            System.out.println("Highest Value: " + highest);
            System.out.println("Second Highest Value: " + secondHighest);
        }
    }
}
