package LeetCodeDay_10_09_08_2026;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int range = nums.length;

        int actualSum = (range * (range + 1)) / 2;

        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
        }

        int ans = actualSum - currSum;

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        System.out.println("Input Array : " + Arrays.toString(nums));

        int result = missingNumber(nums);

        System.out.println("Missing Number = " + result);
    }
}