package LeetCodeDay_21_26_08_2026;


import java.util.Arrays;

public class SearchRange {

	public static int[] searchRange(int[] nums, int target) {

		int[] ans = { -1, -1 };

		if (nums.length == 0) {
			return ans;
		}

		ans[0] = firstOccurence(nums, target);
		ans[1] = lastOccurence(nums, target);

		return ans;
	}

	public static int firstOccurence(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;
		int ans = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			System.out
					.println("FIRST -> start=" + start + ", mid=" + mid + ", end=" + end + ", nums[mid]=" + nums[mid]);

			if (nums[mid] == target) {

				ans = mid;

				// Target found, search LEFT
				end = mid - 1;

			} else if (target > nums[mid]) {

				start = mid + 1;

			} else {

				end = mid - 1;
			}
		}

		return ans;
	}

	public static int lastOccurence(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;
		int ans = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			System.out
					.println("LAST  -> start=" + start + ", mid=" + mid + ", end=" + end + ", nums[mid]=" + nums[mid]);

			if (nums[mid] == target) {

				ans = mid;

				// Target found, search RIGHT
				start = mid + 1;

			} else if (target > nums[mid]) {

				start = mid + 1;

			} else {

				end = mid - 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {

		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		System.out.println("Array = " + Arrays.toString(nums));

		System.out.println("Target = " + target);

		int[] result = searchRange(nums, target);

		System.out.println("Answer = " + Arrays.toString(result));
	}
}