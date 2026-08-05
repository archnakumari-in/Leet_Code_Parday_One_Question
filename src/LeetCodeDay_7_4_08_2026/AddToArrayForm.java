package LeetCodeDay_7_4_08_2026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

	public static List<Integer> addToArrayForm(int[] num, int k) {

		List<Integer> ans = new ArrayList<>();

		int p = num.length - 1;
		int carry = 0;

		while (p >= 0 || k > 0) {

			int numVal = 0;

			if (p >= 0) {
				numVal = num[p];
			}

			int d = k % 10; // Last digit of k
			int sum = numVal + d + carry;

			int digit = sum % 10; // Store last digit
			carry = sum / 10; // Store carry

			ans.add(digit);

			p--; // Move to previous array element
			k = k / 10; // Remove last digit from k
		}

		// If digits are still left in the array
		while (p >= 0) {

			int sum = num[p] + carry;

			ans.add(sum % 10);
			carry = sum / 10;

			p--;
		}

		// If carry is still left
		if (carry > 0) {
			ans.add(carry);
		}

		Collections.reverse(ans);

		return ans;
	}

	public static void main(String[] args) {

		int[] num = { 1, 2, 0, 0 };
		int k = 34;

		List<Integer> result = addToArrayForm(num, k);

		System.out.println("Result = " + result);
	}
}