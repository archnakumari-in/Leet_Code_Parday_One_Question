package LeetCodeDay_25_01_09_2026;


public class SingleNonDuplicate {

    public static int singleNonDuplicate(int[] nums) {

        if (nums.length == 1) {
            return nums[0];

        } else if (nums[0] != nums[1]) {
            return nums[0];

        } else if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

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

            // Check whether mid is the single element
            if (nums[mid] != nums[mid - 1]
                    && nums[mid] != nums[mid + 1]) {

                return nums[mid];

            } else if (mid % 2 == 1) {

                // mid is ODD
                if (nums[mid - 1] == nums[mid]) {

                    // Correct pair → search RIGHT
                    start = mid + 1;

                } else {

                    // Pair broken → search LEFT
                    end = mid - 1;
                }

            } else {

                // mid is EVEN
                if (nums[mid] == nums[mid + 1]) {

                    // Correct pair → search RIGHT
                    start = mid + 1;

                } else {

                    // Pair broken → search LEFT
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int result = singleNonDuplicate(nums);

        System.out.println("Single Element = " + result);
    }
}
