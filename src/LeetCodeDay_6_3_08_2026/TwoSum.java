package LeetCodeDay_6_3_08_2026;


import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    ans[0] = i;
                    ans[1] = j;

                    return ans; // Return immediately after finding the answer
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Input Array : " + Arrays.toString(nums));
        System.out.println("Target      : " + target);
        System.out.println("Output      : " + Arrays.toString(result));
    }
}

