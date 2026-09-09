package LeetCodeDay_35_9_09_2026;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

	public static int findKthLargest(int[] nums, int k) {

		// Create a Min Heap
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		System.out.println("K = " + k);
		System.out.println();

		// Traverse the complete array
		for (int i = 0; i < nums.length; i++) {

			System.out.println("Current element = " + nums[i]);

			// If heap has less than k elements
			if (pq.size() < k) {

				pq.add(nums[i]);

				System.out.println("Added " + nums[i] + " because heap size is less than K");

			}

			// If heap already has k elements
			else if (pq.peek() < nums[i]) {

				System.out.println("Removed smallest element = " + pq.peek());

				pq.remove();

				pq.add(nums[i]);

				System.out.println("Added new larger element = " + nums[i]);

			}

			else {

				System.out.println(nums[i] + " is not larger than heap minimum, so ignored");
			}

			System.out.println("Current Heap = " + pq);
			System.out.println("-----------------------------");
		}

		System.out.println("Final Heap = " + pq);

		return pq.peek();
	}

	public static void main(String[] args) {

		// Input array
		int[] nums = { 3, 2, 1, 5, 6, 4 };

		// We want 2nd largest element
		int k = 2;

		System.out.println("Input Array = " + Arrays.toString(nums));

		System.out.println();

		int answer = findKthLargest(nums, k);

		System.out.println();
		System.out.println("Kth Largest Element = " + answer);
	}
}