package LeetCodeDay_12_9_08_2026;

import java.util.Arrays;

public class SortedSquares {

	public static int[] sortedSquares(int[] nums) {

		int[] ans = new int[nums.length];

		int start = 0;
		int end = nums.length - 1;

		int ptr = ans.length - 1;

		while (start <= end) {

			int ss = nums[start] * nums[start];

			int es = nums[end] * nums[end];

			if (ss > es) {

				ans[ptr] = ss;
				start++;

			} else {

				ans[ptr] = es;
				end--;
			}

			ptr--;
		}

		return ans;
	}

	public static void main(String[] args) {

		int[] nums = { -4, -1, 0, 3, 10 };

		System.out.println("Original Array = " + Arrays.toString(nums));

		int[] result = sortedSquares(nums);

		System.out.println("Sorted Squares = " + Arrays.toString(result));
	}
}