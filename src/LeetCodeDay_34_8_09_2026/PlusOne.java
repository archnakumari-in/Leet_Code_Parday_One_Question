package LeetCodeDay_34_8_09_2026;

import java.util.Arrays;

public class PlusOne {

	public static int[] plusOne(int[] digits) {

		int n = digits.length;

		System.out.println("Length = " + n);

		// Check last digit
		if (digits[n - 1] != 9) {

			System.out.println("Last digit = " + digits[n - 1]);
			System.out.println("Last digit is not 9");

			digits[n - 1] = digits[n - 1] + 1;

			System.out.println("After adding 1 = " + Arrays.toString(digits));

			return digits;
		}

		// Last digit is 9
		System.out.println("Last digit is 9");

		digits[n - 1] = 0;

		System.out.println("After making last digit 0 = " + Arrays.toString(digits));

		// Check remaining digits from right to left
		for (int i = n - 2; i >= 0; i--) {

			System.out.println("Checking index = " + i + ", value = " + digits[i]);

			if (digits[i] != 9) {

				digits[i] = digits[i] + 1;

				System.out.println("After adding 1 = " + Arrays.toString(digits));

				return digits;
			}

			digits[i] = 0;

			System.out.println("Digit was 9, making it 0 = " + Arrays.toString(digits));
		}

		// All digits were 9
		int[] ans = new int[n + 1];

		ans[0] = 1;

		System.out.println("All digits were 9");

		System.out.println("New array = " + Arrays.toString(ans));

		return ans;
	}

	public static void main(String[] args) {

		// Test case
		int[] digits = { 1, 2, 9 };

		System.out.println("Input = " + Arrays.toString(digits));

		int[] result = plusOne(digits);

		System.out.println("Final Answer = " + Arrays.toString(result));
	}
}
