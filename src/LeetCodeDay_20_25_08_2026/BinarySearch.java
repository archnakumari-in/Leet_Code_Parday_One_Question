package LeetCodeDay_20_25_08_2026;

import java.util.Arrays;

public class BinarySearch {

	public static int search(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			System.out.println("start = " + start + ", mid = " + mid + ", end = " + end + ", nums[mid] = " + nums[mid]);

			if (nums[mid] == target) {

				return mid;

			} else if (target > nums[mid]) {

				start = mid + 1;

			} else {

				end = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 7, 9 };
		int target = 7;

		System.out.println("Array = " + Arrays.toString(nums));

		System.out.println("Target = " + target);

		int result = search(nums, target);

		System.out.println("Answer = " + result);
	}
}