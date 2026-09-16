package LeetCodeDay_44_16_09_2026;

import java.util.Arrays;

public class FindDuplicate {

    public static int findDuplicate(int[] nums) {

        int ans = 0;

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println();

        for (int i = 0; i < nums.length; i++) {

            int ele = nums[i];

            System.out.println("i = " + i);
            System.out.println("Current value nums[" + i + "] = " + ele);

            ele = Math.abs(ele);

            System.out.println("After Math.abs(), ele = " + ele);

            System.out.println(
                "Checking nums[" + ele + "] = " + nums[ele]
            );

            if (nums[ele] > 0) {

                nums[ele] = -nums[ele];

                System.out.println(
                    "Positive value found, so nums[" + ele +
                    "] is changed to " + nums[ele]
                );

            } else {

                ans = ele;

                System.out.println(
                    "Duplicate found = " + ans
                );

                break;
            }

            System.out.println(
                "Array after this step: " +
                Arrays.toString(nums)
            );

            System.out.println("-------------------------");
        }

        System.out.println("\nRestoring original array...");

        for (int i = 0; i < nums.length; i++) {

            nums[i] = Math.abs(nums[i]);
        }

        System.out.println(
            "Restored Array: " +
            Arrays.toString(nums)
        );

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        int answer = findDuplicate(nums);

        System.out.println("\n==============================");
        System.out.println("Duplicate Number = " + answer);
        System.out.println("==============================");
    }
}