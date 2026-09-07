package LeetCodeDay_29_06_09_2026;

import java.util.Arrays;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {

	public static void main(String[] args) {

		int[] nums = { -3, -2, -1, 0, 0, 2, 5 };

		System.out.println("Array = " + Arrays.toString(nums));

		int answer = maximumCount(nums);

		System.out.println("Maximum Count = " + answer);
	}

	public static int maximumCount(int[] nums) {

		int lastnegIndex = lastNegative(nums) + 1;

		int firstposIndex = nums.length - firstPositive(nums);

		System.out.println("Negative Count = " + lastnegIndex);
		System.out.println("Positive Count = " + firstposIndex);

		return Math.max(lastnegIndex, firstposIndex);
	}

	public static int lastNegative(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		int ans = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			System.out.println("Last Negative -> start = " + start + ", mid = " + mid + ", end = " + end + ", value = "
					+ nums[mid]);

			if (nums[mid] < 0) {

				ans = mid;

				// Search on right side
				start = mid + 1;

			} else {

				// Search on left side
				end = mid - 1;
			}
		}

		return ans;
	}

	public static int firstPositive(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		int ans = nums.length;

		while (start <= end) {

			int mid = (start + end) / 2;

			System.out.println("First Positive -> start = " + start + ", mid = " + mid + ", end = " + end + ", value = "
					+ nums[mid]);

			if (nums[mid] > 0) {

				ans = mid;

				// Search on left side
				end = mid - 1;

			} else {

				// Search on right side
				start = mid + 1;
			}
		}

		return ans;
	}
}