package LeetCodeDay_30_15_09_2026;

import java.util.HashMap;

public class LongestConsecutive {
	
	    public static int longestConsecutive(int[] nums) {

	        HashMap<Integer, Boolean> hm = new HashMap<>();

	        System.out.println("Input Array:");
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\n\nStep 1: Putting all numbers into HashMap");

	        for (int i = 0; i < nums.length; i++) {

	            hm.put(nums[i], false);

	            System.out.println(
	                "Added: " + nums[i] + " -> false"
	            );
	        }

	        System.out.println("\nHashMap after Step 1:");
	        System.out.println(hm);

	        System.out.println("\nStep 2: Finding starting points");

	        for (int key : hm.keySet()) {

	            if (hm.containsKey(key - 1) == false) {

	                hm.put(key, true);

	                System.out.println(
	                    key + " is a starting point"
	                );
	            }
	        }

	        System.out.println("\nHashMap after Step 2:");
	        System.out.println(hm);

	        int max = 0;

	        System.out.println("\nStep 3: Finding longest sequence");

	        for (int key : hm.keySet()) {

	            int k = 1;

	            if (hm.get(key) == true) {

	                System.out.println(
	                    "\nStarting from: " + key
	                );

	                while (hm.containsKey(key + k) == true) {

	                    System.out.println(
	                        "Found: " + (key + k)
	                    );

	                    k++;
	                }

	                System.out.println(
	                    "Sequence length = " + k
	                );
	            }

	            max = Math.max(max, k);

	            System.out.println(
	                "Current max = " + max
	            );
	        }

	        return max;
	    }

	    public static void main(String[] args) {

	        int[] nums = {100, 4, 200, 1, 3, 2};

	        int answer = longestConsecutive(nums);

	        System.out.println("\n======================");
	        System.out.println("Longest Consecutive Length = " + answer);
	        System.out.println("======================");
	    }
	}


