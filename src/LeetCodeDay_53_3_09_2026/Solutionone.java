package LeetCodeDay_53_3_09_2026;

public class Solutionone {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        System.out.println("Starting currentSum = " + currentSum);
        System.out.println("Starting maxSum = " + maxSum);

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);

            System.out.println(
                "i = " + i +
                ", nums[i] = " + nums[i] +
                ", currentSum = " + currentSum +
                ", maxSum = " + maxSum
            );
        }

        return maxSum;
    }
}