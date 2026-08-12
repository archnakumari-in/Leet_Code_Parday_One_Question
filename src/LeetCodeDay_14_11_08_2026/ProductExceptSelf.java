package LeetCodeDay_14_11_08_2026;

import java.util.Arrays;

public class ProductExceptSelf {

	public static int[] productExceptSelf(int[] nums) {

		int n = nums.length;

		int[] right = new int[n];

		int pro = 1;

		// Calculate right/suffix products
		for (int i = n - 1; i >= 0; i--) {

			pro = pro * nums[i];

			right[i] = pro;
		}

		int[] ans = new int[n];

		int left = 1;

		// Calculate left product × right product
		for (int i = 0; i < n - 1; i++) {

			int val = left * right[i + 1];

			ans[i] = val;

			left = left * nums[i];
		}

		// Last element has no right side
		ans[n - 1] = left;

		return ans;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };

		System.out.println("Input = " + Arrays.toString(nums));

		int[] result = productExceptSelf(nums);

		System.out.println("Output = " + Arrays.toString(result));
	}
	
}