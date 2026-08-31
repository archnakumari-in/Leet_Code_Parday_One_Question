package LeetCodeDay_31_25_08_2026;

public class FindPeakElement {

	public static int findPeakElement(int[] nums) {

		if (nums.length == 1) {
			return 0;

		} else if (nums[0] > nums[1]) {
			return 0;

		} else if (nums[nums.length - 1] > nums[nums.length - 2]) {
			return nums.length - 1;

		} else {

			int start = 1;
			int end = nums.length - 2;

			while (start <= end) {

				int mid = (start + end) / 2;

				System.out.println(
						"start = " + start + ", mid = " + mid + ", end = " + end + ", nums[mid] = " + nums[mid]);

				// Check if mid is a peak
				if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {

					return mid;

				} else if (nums[mid] < nums[mid + 1]) {

					// We are going UP → move right
					start = mid + 1;

				} else {

					// We are going DOWN → move left
					end = mid - 1;
				}
			}

			return -1;
		}
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };

		int result = findPeakElement(nums);

		System.out.println("Peak Index = " + result);
		System.out.println("Peak Value = " + nums[result]);
	}
}