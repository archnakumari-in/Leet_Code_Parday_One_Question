package LeetCodeDay_43_18_09_2026;

import java.util.Arrays;

public class PivotIndex {

	public static int pivotIndex(int[] nums) {

		int rsum = 0;

		System.out.println("Array = " + Arrays.toString(nums));
		System.out.println("\nCalculating total sum:");

		for (int ele : nums) {

			rsum += ele;

			System.out.println("ele = " + ele + " | rsum = " + rsum);
		}

		int lsum = 0;

		System.out.println("\nStarting Pivot Search...");
		System.out.println("--------------------------------");

		for (int i = 0; i < nums.length; i++) {

			rsum -= nums[i];

			System.out.println("\nIndex = " + i);
			System.out.println("Current Element = " + nums[i]);
			System.out.println("Left Sum  = " + lsum);
			System.out.println("Right Sum = " + rsum);

			if (rsum == lsum) {

				System.out.println("Left Sum == Right Sum");
				System.out.println("Pivot Found at Index = " + i);

				return i;
			}

			lsum += nums[i];

			System.out.println("No Pivot. Updated Left Sum = " + lsum);
		}

		System.out.println("\nNo Pivot Index Found.");

		return -1;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 7, 3, 6, 5, 6 };

		int answer = pivotIndex(nums);

		System.out.println("Final Pivot Index = " + answer);
	}
}