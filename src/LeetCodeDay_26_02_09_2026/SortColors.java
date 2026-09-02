package LeetCodeDay_26_02_09_2026;

import java.util.Arrays;

public class SortColors {

	public static void sortColors(int[] nums) {

		int low = 0;
		int mid = 0;
		int high = nums.length - 1;

		while (mid <= high) {

			if (nums[mid] == 0) {

				swap(nums, low, mid);

				low++;
				mid++;

			} else if (nums[mid] == 1) {

				mid++;

			} else {

				swap(nums, high, mid);

				high--;
			}
		}
	}

	public static void swap(int[] nums, int i, int j) {

		int k = nums[i];

		nums[i] = nums[j];

		nums[j] = k;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 0, 2, 1, 1, 0 };

		System.out.println("Before sorting: " + Arrays.toString(nums));

		sortColors(nums);

		System.out.println("After sorting:  " + Arrays.toString(nums));
	}
}
