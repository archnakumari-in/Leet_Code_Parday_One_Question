package LeetCodeDay_22_27_08_2026;

public class SearchRotatedArray {
	
	    public static int search(int[] nums, int target) {

	        int start = 0;
	        int end = nums.length - 1;

	        while (start <= end) {

	            int mid = (start + end) / 2;

	            System.out.println(
	                "start = " + start
	                + ", mid = " + mid
	                + ", end = " + end
	                + ", nums[mid] = " + nums[mid]
	            );

	            if (nums[mid] == target) {

	                return mid;

	            // Left part is sorted
	            } else if (nums[start] <= nums[mid]) {

	                if (target >= nums[start]
	                        && target < nums[mid]) {

	                    // Search left
	                    end = mid - 1;

	                } else {

	                    // Search right
	                    start = mid + 1;
	                }

	            // Right part is sorted
	            } else {

	                if (target > nums[mid]
	                        && target <= nums[end]) {

	                    // Search right
	                    start = mid + 1;

	                } else {

	                    // Search left
	                    end = mid - 1;
	                }
	            }
	        }

	        return -1;
	    }

	    public static void main(String[] args) {

	        int[] nums = {4, 5, 6, 7, 0, 1, 2};

	        int target = 0;

	        int result = search(nums, target);

	        System.out.println("Target = " + target);
	        System.out.println("Answer = " + result);
	    }
	}
	
	


