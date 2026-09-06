package LeetCodeDay_29_06_09_2026;

import LeetCodeDay_29_5_09_2026.Solutionone;

public class Main {

    public static void main(String[] args) {

        Solutionone sol = new Solutionone();

        int[] nums = {78, 30, 34, 5, 9};

        System.out.println("Input array:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();

        String answer = sol.largestNumber(nums);

        System.out.println("Largest Number = " + answer);
    }
}