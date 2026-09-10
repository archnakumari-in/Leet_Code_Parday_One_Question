package LeetCodeDay_35_29_10_2026;

import java.util.Arrays;

public class AverageSalary {

	public static double average(int[] salary) {

		// First element se max, min and sum initialize
		int max = salary[0];
		int min = salary[0];
		int sum = salary[0];

		System.out.println("Starting Max = " + max);
		System.out.println("Starting Min = " + min);
		System.out.println("Starting Sum = " + sum);
		System.out.println();

		// Remaining elements check karna
		for (int i = 1; i < salary.length; i++) {

			System.out.println("Index = " + i + ", Current Salary = " + salary[i]);

			// Maximum check
			if (max < salary[i]) {

				max = salary[i];

				System.out.println("Maximum updated = " + max);
			}

			// Minimum check
			if (min > salary[i]) {

				min = salary[i];

				System.out.println("Minimum updated = " + min);
			}

			// Sum update
			sum = sum + salary[i];

			System.out.println("Current Sum = " + sum);

			System.out.println("--------------------------");
		}

		// Minimum and maximum salary remove
		sum = sum - min - max;

		System.out.println();
		System.out.println("Final Maximum = " + max);
		System.out.println("Final Minimum = " + min);
		System.out.println("Sum after removing Min and Max = " + sum);

		// Calculate average
		double ans = (double) sum / (salary.length - 2);

		return ans;
	}

	public static void main(String[] args) {

		// Input
		int[] salary = { 4000, 3000, 1000, 2000, 5000 };

		System.out.println("Salary Array = " + Arrays.toString(salary));

		System.out.println();

		// Call method
		double answer = average(salary);

		// Print final answer
		System.out.println();
		System.out.println("Average Salary = " + answer);
	}
}